package com.hillel.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {
    private static RequestSpecification requestSpecification;

    @BeforeAll
    public static void init() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    @Test
    public void createUser() {
        User expected = new User();
        expected.setName("morpheus");
        expected.setJob("leader");

        User user1 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("api/users")
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);

        assertThat(user1).isEqualToIgnoringGivenFields(expected, "id", "createdAt");
        Assertions.assertEquals(user1.getName(), expected.getName());
        Assertions.assertEquals(user1.getJob(), expected.getJob());
    }

    @Test
    public void getSingleUser() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users/2")
                .thenReturn();
        response.then().statusCode(200);
    }

    @Test
    public void getResource() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("/api/unknown/2")
                .thenReturn();
        response.then().statusCode(200);
    }

    @Test
    public void getUser() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users/2")
                .thenReturn();
        response.then().statusCode(200);
        String data = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data.email");
        String id = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data.id");
        System.out.println(id);
        System.out.println(data);
    }
}

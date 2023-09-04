package com.rozetka.patterns;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    private static WebDriver webDriver;

    @BeforeAll
    public static void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://elmir.ua/");
        Thread.sleep(3000);
    }

    @Test
    @DisplayName("Check login with unregistered user")
    public void testLogin() {
        WebElement webElement = webDriver.findElement(By.xpath("//div[@id =\"autho\"]"));
        webElement.click();

        WebElement inputLogin = webDriver.findElement(By.xpath("//input[@name=\"login\"]"));
        inputLogin.sendKeys("mylogin@gmail.com");

        WebElement inputPassword = webDriver.findElement(By.xpath("//input[@name=\"password\"]"));
        inputPassword.sendKeys("somepassword");

        WebElement loginButton = webDriver.findElement(By.xpath("//button[@class=\"mw-submit\"]"));
        loginButton.click();

        WebElement errorPasswordValidation = webDriver.findElement(By.xpath("//div[@class=\"mw_error_text\"]"));
        Assertions.assertTrue(errorPasswordValidation.isDisplayed());  //месседж отображается
        Assertions.assertEquals("Неверные данные входа", errorPasswordValidation.getText()); //проверить совпадение текста
    }

    @Test
    @DisplayName("Add a few product to the shop cart and delete them")
    public void addProductToCardAndDelete() {
        webDriver.get("https://elmir.ua/");
        WebElement element = webDriver.findElement(By.xpath("//a[@id=\"out-link-4\"]"));
        element.click();

        WebElement phone = webDriver.findElement(By.xpath("//a[@title =\"Мобильный телефон Xiaomi Poco F5 12/256GB Black EU\"]"));
        phone.click();

        WebElement color = webDriver.findElement(By.xpath("//div[@style=\"background-color: #83b1d2\"]"));
        color.click();

        WebElement buttonBuy = webDriver.findElement(By.xpath("//div[@onclick=\"btn_buy(1448661);\"]"));
        buttonBuy.click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement buttonAddToCard = webDriver.findElement(By.xpath("//*[contains(@class,'button big-btn text-btn') and contains(text(),'В корзину')]"));
        buttonAddToCard.click();
        String link = webDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("basket.html"));

        WebElement buttonDelete = webDriver.findElement(By.xpath("//a[@hint=\"Удалить этот товар из корзины\"]"));
        buttonDelete.click();
    }

    @Test
    @DisplayName("Add and compare 2 items")
    public void addProductsAndCompareThem() {
        webDriver.get("https://elmir.ua/");

        WebElement element = webDriver.findElement(By.xpath("//a[@id=\"tab-5\"]"));
        element.click();
        String link = webDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("mobile_connection/"));

        WebElement smartWatches = webDriver.findElement(By.xpath("//*[contains(@class,'cat-name') and contains(text(),'Смарт-часы и фитнес браслеты')]"));
        smartWatches.click();

        String link2 = webDriver.getCurrentUrl();
        Assertions.assertTrue(link2.contains("smart_watches_and_fitness_bracelets/"));

        WebElement smartWatchFirst = webDriver.findElement(By.xpath("//a[@title=\"Смарт-часы Xiaomi Mibro X1 Black\"]"));
        smartWatchFirst.click();

        WebElement buttonForCompare = webDriver.findElement(By.xpath("//span[@hint=\"Добавить к сравнению\"]"));
        buttonForCompare.click();
        webDriver.navigate().back();

        WebElement smartWatchSecond = webDriver.findElement(By.xpath("//a[@title=\"Смарт-часы Amazfit Bip 3 Pro Black\"]"));
        smartWatchSecond.click();

        WebElement buttonForCompare2 = webDriver.findElement(By.xpath("//span[@hint=\"Добавить к сравнению\"]"));
        buttonForCompare2.click();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement button = webDriver.findElement(By.xpath("//a[@class=\"compare-counter category_251309\"]"));
        button.click();
        String link3 = webDriver.getCurrentUrl();
        Assertions.assertTrue(link3.contains("module=compare"));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement buttonDeleteAll = webDriver.findElement(By.xpath("//a[@id=\"delete-all\"]"));
        buttonDeleteAll.click();

        WebElement clearComparationMessage = webDriver.findElement(By.xpath("//div[@class=\"elmir-msg elmir-error\"]"));
        Assertions.assertTrue(clearComparationMessage.isDisplayed());
        Assertions.assertEquals("Не указаны товары для сравнения", clearComparationMessage.getText());
    }

    @AfterAll
    public static void teardown() {
        webDriver.quit();
    }
}

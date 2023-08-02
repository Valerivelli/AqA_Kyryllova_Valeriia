package com.hillel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductMarket productMarket = new ProductMarket();
        List<Product> list = productMarket.getList();

        list.add(new Product("meat", 30));
        list.add(new Product("bread", 4.5));
        list.add(new Product("fish", 24));
        list.add(new Product("wine", 45.5));
        list.add(new Product("beer", 12));
        list.add(new Product("water", 9.5));
        list.add(new Product("juice", -5));
        list.add(new Product("gyn", -12.3));

        System.out.println("Name of our products: " + productMarket.getAllNameOfProducts(list));
        System.out.println("Sorted names of products: " + productMarket.sortAllProductAlphabetically(list));
        System.out.println("Prices higher than 10 : " + productMarket.getPriceHigherThan10(list));
        System.out.println("Prices less than 0: " + productMarket.getPriceLessThan5(list));
        System.out.println("Prices of products as \"String\": " + productMarket.getPricesAsStringsForProductList(list));

    }
}

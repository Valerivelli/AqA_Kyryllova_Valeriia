package com.hillel;

import java.util.Collections;
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

        System.out.println("Name of our products: " + productMarket.getAllNameOfProducts(list));
        System.out.println("Sorted names of products: " + productMarket.sortAllProductAlphabetically(list));
        System.out.println("Prices higher than 10 : " + productMarket.getPriceHigherThan10(list));
        System.out.println("Prices less than 5: " + productMarket.getPriceLessThan5(list));
        System.out.println("Prices of Products as String: " + productMarket.getPricesAsStringsForProductList(list));

        Collections.sort(list, new ProductComparatorByPrice());

        System.out.print("Sorted products by price: \n");
        for (Product product : list) {
            System.out.println(product.getPrice());
        }
    }
}

package com.hillel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    ArrayList<Product> list;

    public ProductMarket() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public List<String> getAllNameOfProducts(List<Product> list) {
        return list.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> sortAllProductAlphabetically(List<Product> list) {
        return list.stream()
                .sorted(Comparator.comparing(Product::getName))
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<Double> getPriceHigherThan10(List<Product> list) {
        return list.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Double> getPriceLessThan5(List<Product> list) {
        return list.stream()
                .map(Product::getPrice)
                .filter(price -> price < 0)
                .collect(Collectors.toList());
    }

    public List<String> getPricesAsStringsForProductList(List<Product> list) {
        return list.stream()
                .map(Product::getPrice)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}

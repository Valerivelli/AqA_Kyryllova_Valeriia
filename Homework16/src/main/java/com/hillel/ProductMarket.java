package com.hillel;

import java.util.*;

public class ProductMarket {
    ArrayList<Product> list;

    public ProductMarket() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Product> getList() {
        return list;
    }


    public List<String> getAllNameOfProducts(List<Product> list) {
        List<String> result = new ArrayList<>();

        for (Product product : list) {
            result.add(product.getName());
        }
        return result;
    }


    public List<String> sortAllProductAlphabetically(List<Product> list) {
        List<String> result = new ArrayList<>();

        for (Product product : list) {
            result.add(product.getName());
        }
        Collections.sort(result);
        return result;
    }

    public List<Double> getPriceHigherThan10(List<Product> list) {
        List<Double> result = new ArrayList<>();

        for (Product product : list) {
            if (product.getPrice() > 10) {
                result.add(product.getPrice());
            }
        }
        return result;
    }

    public List<Double> getPriceLessThan5(List<Product> list) {
        List<Double> result = new ArrayList<>();

        for (Product product : list) {
            if (product.getPrice() < 5) {
                result.add(product.getPrice());
            }
        }
        return result;
    }

    public List<String> getPricesAsStringsForProductList(List<Product> list) {
        List<String> result = new ArrayList<>();

        for (Product product : list) {
            result.add(String.valueOf(product.getPrice()));
        }
        return result;
    }

}


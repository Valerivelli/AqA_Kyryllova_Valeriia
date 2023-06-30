package com.hillel.task1;

public class Main {
    public static void main(String[] args) {
        Wine sauvignonBlanc = new Wine(12.5f, "Marlborough Sun Sauvignon Blanc", false, "dry", "white", "Sauvignon Blanc", 2010);
        Wine cabernet = new Wine(11f, "Cabernet d'Anjou", false, "semi dry", "rose", "Cabernet d'Anjou", 2003);
        Beer paleAleCitra = new Beer(4.2f, "American Pale Ale Citra", true, "Ale", "white");
        Beer irishDryStout = new Beer(5.5f, "Uncle Beer Irish Dry Stout", true, "lager", "black");

        printWine(sauvignonBlanc);
        printLineSeparated();
        printWine(cabernet);
        printLineSeparated();
        printBeer(paleAleCitra);
        printLineSeparated();
        printBeer(irishDryStout);
    }

    public static void printWine(Wine wine) {
        System.out.println("Name: " + wine.getName() + "\nPercentage of alcohol: " +
                wine.getPercentageOfAlcohol() + "\nIs it carbonated? " + wine.isCarbonated() +
                "\nType of wine: " + wine.getTypeOfWine() + "\nColor of wine: " + wine.getColor() +
                "\nSort of wine: " + wine.getSortOfGrape() + "\nYear of production: " + wine.getYearOfProduction());
    }

    public static void printBeer(Beer beer) {
        System.out.println("Name:" + beer.getName() + "\nPercentage of alcohol: " + beer.getPercentageOfAlcohol() +
                "\nIs it carbonated? " + beer.isCarbonated() + "\nType of beer: " + beer.getType() +
                "\nColor of beer: " + beer.getColor());
    }

    public static void printLineSeparated() {
        System.out.println("________________________");
    }

}

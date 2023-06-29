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
        System.out.println("Name: " + wine.name + "\nPercentage of alcohol: " +
                wine.percentageOfAlcohol + "\nIs it carbonated? " + wine.carbonated +
                "\nType of wine: " + wine.typeOfWine + "\nColor of wine: " + wine.color +
                "\nSort of wine: " + wine.sortOfGrape + "\nYear of production: " + wine.yearOfProduction);
    }

    public static void printBeer(Beer beer) {
        System.out.println("Name:" + beer.name + "\nPercentage of alcohol: " + beer.percentageOfAlcohol +
                "\nIs it carbonated? " + beer.carbonated + "\nType of beer: " + beer.type +
                "\nColor of beer: " + beer.color);
    }

    public static void printLineSeparated() {
        System.out.println("________________________");
    }

}

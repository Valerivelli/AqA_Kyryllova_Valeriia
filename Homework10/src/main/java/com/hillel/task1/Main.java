package com.hillel.task1;

public class Main {
    public static void main(String[] args) {
        Wine sauvignonBlanc = new Wine(12.5f, "Marlborough Sun Sauvignon Blanc", false, "dry", "white", "Sauvignon Blanc", 2010);
        Wine cabernet = new Wine(11f, "Cabernet d'Anjou", false, "semi dry", "rose", "Cabernet d'Anjou", 2003);
        Beer paleAleCitra = new Beer(4.2f, "American Pale Ale Citra", true, "Ale", "white");
        Beer irishDryStout = new Beer(5.5f, "Uncle Beer Irish Dry Stout", true, "lager", "black");

        sauvignonBlanc.printObject();
        printLineSeparated();
        cabernet.printObject();
        printLineSeparated();
        paleAleCitra.printObject();
        printLineSeparated();
        irishDryStout.printObject();
    }

    public static void printLineSeparated() {
        System.out.println("________________________");
    }

}

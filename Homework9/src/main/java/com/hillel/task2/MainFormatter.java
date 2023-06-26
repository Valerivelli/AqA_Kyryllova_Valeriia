package com.hillel.task2;

import java.util.Formatter;

public class MainFormatter {
    public static void main(String[] args) {
        printInfoAboutStudents("Иванов",5,"Математике");
        printInfoAboutStudents("Петров",4,"Физике");
        printInfoAboutStudents("Сидорова",3,"Программированию");
    }
    private static void printInfoAboutStudents(String fullName, int mark, String subject){
        System.out.printf("Студент %-15s получил %-3s по %-10s\n", fullName,mark,subject);
    }
}

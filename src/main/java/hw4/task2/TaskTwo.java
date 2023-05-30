package hw4.task2;

import java.util.Scanner;

public class TaskTwo {
    private static final int euro = 28;

    public static void main(String[] args) {
        int vasyasMoney = getVasyasMoney();

        if (vasyasMoney > 0) {
            float amount = (float) (vasyasMoney * 2) / euro;
            System.out.println("Your money for vacation is: " + amount + " euro");
        } else System.out.println("Pls enter correct value!");
    }

    private static int getVasyasMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter value of your money: ");
        return scanner.nextInt();
    }

}

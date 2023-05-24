package hw1;

public class VariablesAndCalculation {
    public static void main(String[] args) {
        initAndPrintVariables();
        calculationOfVariables();
    }

    private static void initAndPrintVariables() {
        int a = 5;
        System.out.println("int = " + a);
        char ch = 'w';
        System.out.println("char = " + ch);
        byte b = 115;
        System.out.println("byte =" + b);
        long l = 92233720368L;
        System.out.println("long = " + l);
        float f = 11.115f;
        System.out.println("float = " + f);
        double d = 13.1548965d;
        System.out.println("double = " + d);
        boolean boolT = true;
        boolean boolF = false;
        System.out.println("boolean values : " + boolF + " , " + boolT);

    }

    private static void calculationOfVariables() {
        int firstValue = 12;
        int secondValue = 35;

        int sum = firstValue + secondValue;
        System.out.println("sum of values : " + sum);

        int diff = firstValue - secondValue;
        System.out.println("diff of values : " + diff);

        int mult = firstValue * secondValue;
        System.out.println("mult of values : " + mult);

        float dev = (float) firstValue / secondValue;
        System.out.println("dev of values : " + dev);
    }
}

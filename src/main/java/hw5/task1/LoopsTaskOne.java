package hw5.task1;

public class LoopsTaskOne {
    public static void main(String[] args) {

        calculationOfSequences();
    }

    private static void calculationOfSequences() {
        for (int i = 1000; i <= 9999; i = i + 3) {
            System.out.println(i);
        }
    }
}

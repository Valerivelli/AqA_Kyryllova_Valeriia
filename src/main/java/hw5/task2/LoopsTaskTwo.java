package hw5.task2;

public class LoopsTaskTwo {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 6, 2, -2, -6, -10};

        for (int x : arr) {
            if (x >= 0) {
                System.out.println("Positive value from array is: " + x);
            }
        }
    }
}

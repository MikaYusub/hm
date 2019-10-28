package general.Tasks_in_class;

import java.util.Random;

public class TaskInClass {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.println("fizz");
                if (value % 3 == 0) {
                    System.out.println("fizzbuzz");
                }
            }
            if (value % 3 == 0 && value % 2 != 0) {
                System.out.println("buzz");
            }
        }
    }
}

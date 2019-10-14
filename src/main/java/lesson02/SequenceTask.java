package lesson02;

import java.util.Arrays;
import java.util.Random;

public class SequenceTask {

    private static int[] generate() {
        int []sequence = new int[20];
        Random random = new Random();
        for (int i = 0; i < sequence.length; i++) {
            int randInt = random.nextInt(21)-10;
            sequence[i]= randInt;
        }
        return sequence;
    }

    public static void main(String[] args) {

        int[] origin = generate();
        int[] negatives = filter_negatives(origin);
        int[] odd = filter_odd(origin);
        int[] even = filter_even(origin);
        System.out.println("Origin: " + Arrays.toString(origin));
        System.out.println("Odd: " + Arrays.toString(odd));
        System.out.println("Even: " +Arrays.toString(even));
        System.out.println("Negatives: " + Arrays.toString(negatives));
    }

    private static int[] filter_even(int []arr) {
        int []even = new int[0];

        for (int value : arr) {
            if (value % 2 == 0 & value > 0) {
                even = Arrays.copyOf(even, even.length + 1);
                even[even.length - 1] = value;
            }
        }
        return even;
    }
    private static int[] filter_odd(int []arr) {
        int []odd = new int[0];

        for (int value : arr) {
            if (value % 2 != 0 & value > 0) {
                odd = Arrays.copyOf(odd, odd.length + 1);
                odd[odd.length - 1] = value;
            }
        }
        return odd;
    }
    private static int[] filter_negatives(int []arr) {
        int []negative = new int[0];
        for (int value : arr) {
            if (value < 0) {
                negative = Arrays.copyOf(negative, negative.length + 1);
                negative[negative.length - 1] = value;
            }
        }
        return negative;
    }


}





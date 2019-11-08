package general.Tasks_in_class;

import Homeworks.hw1.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    static int counter = 0;

    public static void main(String[] args) {
        Random rd = new Random();
        int N = 100;
        int[] intArray = new int[30];
        int randInt = rd.nextInt(N);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rd.nextInt(N);
        }
        BubbleSort.Sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(randInt);
        System.out.println(find(intArray, randInt));
        System.out.println(counter);
    }

    private static boolean find(int[] intArray, int numberToFind) {
        int left = 0;
        int right = intArray.length - 1;
        if (right >= left) {
            counter++;
            int mid = (right + left) / 2;
            if (intArray[mid] == numberToFind) return true;
            if (intArray[mid] < numberToFind) left = mid + 1;
            else if (intArray[mid] > numberToFind) right = mid - 1;
        }
        return false;
    }
}

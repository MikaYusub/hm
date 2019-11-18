package Homeworks.hw1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1_Done {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int random_number = rand.nextInt(101);
        System.out.println("Let the game begin, type your name please:");
        String name = scanner.nextLine();
        System.out.println("Type a number:");
        int[] intArray = new int[0];
        while (true) {
            int player_number = scanner.nextInt();
            if (player_number < random_number) {
                System.out.println("Your number is too small. Please, try again.");
                intArray = Arrays.copyOf(intArray, intArray.length + 1);
                intArray[intArray.length - 1] = player_number;
            } else if (player_number > random_number) {
                System.out.println("Your number is too big. Please, try again.");
                intArray = Arrays.copyOf(intArray, intArray.length + 1);
                intArray[intArray.length - 1] = player_number;
            } else {
                System.out.printf("Congratulations, %s", name);
                intArray = Arrays.copyOf(intArray, intArray.length + 1);
                intArray[intArray.length - 1] = player_number;
                BubbleSort.Sort(intArray);
                System.out.println("\nYour numbers:" + Arrays.toString(intArray));
                break;
            }
        }
    }
}
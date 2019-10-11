import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int random_number = rand.nextInt(101);
        System.out.println("Let the game begin, type your name please:");
        String name = scanner.nextLine();
        System.out.println("Type a number:");
        int[] intArray = new int[0];
        while(true){
            int player_number = scanner.nextInt();
            if (player_number < random_number){
                System.out.println("Your number is too small. Please, try again.");
                intArray = Arrays.copyOf(intArray, intArray.length + 1);
                intArray[intArray.length-1] = player_number;
            }else if (player_number > random_number){
                System.out.println("Your number is too big. Please, try again.");
                intArray = Arrays.copyOf(intArray, intArray.length + 1);
                intArray[intArray.length-1] = player_number;
            } else{
                System.out.printf("Congratulations, %s", name);
                intArray = Arrays.copyOf(intArray, intArray.length + 1);
                intArray[intArray.length-1] = player_number;
                bubbleSort(intArray);
                System.out.println("\nYour numbers:" + Arrays.toString(intArray));
                break;
            }
        }
    }
    private static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;

		for(int i=0; i < n; i++){
        for(int j=1; j < (n-i); j++){

            if(intArray[j-1] > intArray[j]){
                //swap the elements!
                temp = intArray[j-1];
                intArray[j-1] = intArray[j];
                intArray[j] = temp;
            }

        }
    }

    }
}
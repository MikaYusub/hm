package Homeworks.hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];
        int[] Aim = CreatedAim();
        int [][] allShoots = new int[0][0];
        System.out.println("All set. Get ready to rumble!");
        while (true){
            int[] PlayerShoot = PlayerTurn();
            allShoots = Arrays.copyOf(allShoots, allShoots.length + 1);
            allShoots[allShoots.length-1] = PlayerShoot;
            System.out.println(allShoots.length + "+" + allShoots[0].length);
            for (int i = 0; i < allShoots.length; i++) {
                for (int j = 0; j < allShoots[i].length; j++) {
                    System.out.println(Arrays.toString(allShoots[i]));
                }
            }
            BuildGameField( matrix, allShoots, Aim);
            if (Arrays.equals(PlayerShoot, Aim)){
                System.out.println("You win");
                break;
            }
        }

    }

    private static void UpdatedGameField(int[][] allShoots, int[] Aim, int[][] matrix) {
        BuildGameField(matrix, allShoots, Aim);



    }

    private static int[] PlayerTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select row to shoot");
        int player_row = scanner.nextInt();
        while(player_row < 1 || player_row > 5){
            System.out.println("Try again!");
            player_row = scanner.nextInt();
        }
        System.out.println("Select column to shoot");
        int player_column = scanner.nextInt();
        while(player_column < 1 || player_column > 5){
            System.out.println("Try again!");
            player_column = scanner.nextInt();
        }
        int []arr;
        arr = new int[2];
        arr[0]= player_row;
        arr[1]= player_column;
        return arr;
    }

    private static int[] CreatedAim() {
        Random random = new Random();
        int random_column = random.nextInt(6) ;
        int random_row = random.nextInt(6);
        int []arr;
        //System.out.println();
        arr = new int[2];
        arr[0]= random_column;
        arr[1]= random_row;
        return arr;
    }

    private static void BuildGameField(int[][] matrix, int [][] allShoots, int [] Aim) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i>0 && j>0){
                    for (int k = 0; k < allShoots.length; k++) {
                        if (i != allShoots[k][0]) {
                            System.out.print("-" + " |\t");
                        }else if(j!=allShoots[k][1]){
                            System.out.print("-" + " |\t");
                        }else{
                            System.out.print("*" + " |\t");
                        }
                    }
                }else{
                    if (i==0){
                        System.out.print(j+ " |\t");
                    }
                    if (j==0 && i!=j){
                        System.out.print(i+ " |\t");
                    }

                }
                }
                System.out.println();
            }

        }
}

package lesson02;

import java.util.Arrays;
import java.util.Random;

public class MatrixTask {
    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        int [] intArray_n = new int[0];
        int [] intArray_p = new int[0];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                int random_number = rand.nextInt(11);
                int random_with_negative = random_number-5;
                matrix[i][j]= random_with_negative;
                if(matrix[i][j]<0){
                    intArray_n = Arrays.copyOf(intArray_n, intArray_n.length + 1);
                    intArray_n[intArray_n.length-1] = random_with_negative;
                }else{
                    intArray_p = Arrays.copyOf(intArray_p,intArray_p.length+1);
                    intArray_p[intArray_p.length-1] = random_with_negative;
                }
            }
        }
        System.out.println("Negative numbers of this matrix: " + Arrays.toString(intArray_n));
        System.out.println("Positive numbers of this matrix: " + Arrays.toString(intArray_p));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]<0){
                    System.out.printf("%3d", matrix[i][j]);
                }else System.out.printf("%3d", 0);
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]>0){
                    System.out.printf("%3d", matrix[i][j]);
                }else System.out.printf("%3d", 0);
            }
            System.out.println();
            }
        }
    }


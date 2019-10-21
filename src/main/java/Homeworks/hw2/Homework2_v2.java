package Homeworks.hw2;

import java.util.Arrays;

public class Homework2_v2 {
    public static void main(String[] args) {
        PrintGamefield();
    }

    private static void PrintGamefield() {
        String shooted= "*";
        String notShooted="-";
        String walls = "|";
        String [][] GameField ;
        GameField = new String[6][6];
        for (int i = 0; i < GameField.length; i++) {
            GameField[0][i] = String.join("", Integer.toString(i), " ");
            GameField[i][0] = String.join("",Integer.toString(i), "|");
                        //String.join(" |", Integer.toString(GameField.length-5), " ");
            System.out.println(Arrays.toString(GameField[i]));
        }
        for (int i = 0; i < GameField.length-1; i++) {
            GameField[1][i] = String.join(" |", notShooted);
        }
    }
}

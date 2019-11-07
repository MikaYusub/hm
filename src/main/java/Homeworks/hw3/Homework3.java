package Homeworks.hw3;

import java.util.Scanner;

public class Homework3 {

    private static Scanner scanner = new Scanner(System.in);
    private static String UserInput;

    public static void main(String[] args) {
        System.out.println("Please input the day of week");
        UserInput = scanner.nextLine().toLowerCase();
        final String[][] schedule = BuildSchedule();
        StartApp(schedule);
    }

    public static void setUserInput(String userInput) {
        UserInput = userInput;
    }


    private static String[][] BuildSchedule() {
        String[][] schedule = new String[][]
                {{"Monday", "Do some homework"}
                        , {"Tuesday", "Go to gym"}
                        , {"Wednesday", "Talk with teacher"}
                        , {"Thursday", "Go to play football"}
                        , {"Friday", "Read a book"}
                        , {"Saturday", "Go to a birthday party"}
                        , {"Sunday", "Go out with friends"}};
        return schedule;
    }

    private static void StartApp(String[][] schedule) {
        while (!UserInput.equals("exit")) {
            switch (UserInput) {
                case "monday":
                    System.out.printf("Your task for %s: %s\n", schedule[0][0], schedule[0][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[1][0], schedule[1][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                case "wednesday":
                    System.out.printf("Your task for %s: %s\n", schedule[2][0], schedule[2][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                case "thursday":
                    System.out.printf("Your task for %s: %s\n", schedule[3][0], schedule[3][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                case "friday":
                    System.out.printf("Your task for %s: %s\n", schedule[4][0], schedule[4][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                case "saturday":
                    System.out.printf("Your task for %s: %s\n", schedule[5][0], schedule[5][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                case "sunday":
                    System.out.printf("Your task for %s: %s\n", schedule[6][0], schedule[6][1]);
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    setUserInput(scanner.nextLine().toLowerCase());
                    break;
            }
        }
    }
}
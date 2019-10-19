package Homeworks.hw3;

import java.util.Scanner;

public class Homework3 {

    public static int i = 0;
    public static String UserInput;

    public static void main(String[] args) {
        final String[][] schedule = BuildSchedule();
        StartApp(schedule);
    }

    private static void StartApp(String[][] schedule) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the day of week");
        UserInput = scanner.nextLine().toLowerCase();
        while (!UserInput.equals("exit")) {
            switch (i) {
                case 0:
                    for (String[] strings : schedule) {
                        String weekdays = strings[0], tasks = strings[1];
                        if (UserInput.contains(weekdays.toLowerCase())) {
                            System.out.printf("Your task for %s: %s\n", weekdays, tasks);
                            UserInput = scanner.nextLine().toLowerCase();
                            i = 0;
                            break;
                        } else i = 1;
                    }
                case 1:
                    UserInput = scanner.nextLine().toLowerCase();
                    System.out.println("Sorry, I don't understand you, please try again.");
                    i = 0;
            }
        }
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
}
package general.Tasks_in_class;

import java.util.ArrayList;

public class warmup2810 {
    public static void main(String[] args) {
        String string = "1 12 3a";
        String[] splitted_string = string.split(" ");
        int sum = 0;
        for (String s : splitted_string) {
            if (s.equals(Integer.parseInt(s)))
            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    sum += ch;
                }
            }
        }
        System.out.println(sum);
    }
}

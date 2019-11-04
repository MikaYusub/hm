package general;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Warmup3010 {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            list.add(BuildString());

        }
        list.stream().collect(Collectors.toList());
        System.out.println(list);
    }

    private static StringBuilder BuildString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rand_in_range_30_10() ; i++) {
            stringBuilder.append(randletter());
        }
        return stringBuilder;
    }

    private static char randletter() {
        final String letters_up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String letters_down = letters_up.toLowerCase();
        final String all_letters = letters_down.concat(letters_up);
        Random random = new Random();
        int rand_index = random.nextInt(all_letters.length());
        return all_letters.charAt(rand_index);
    }
    private static int rand_in_range_30_10(){
        int max_len = 30;
        int min_len = 10;
        int range = max_len-min_len+1;
        int rand = (int) (Math.random()*range)+min_len;
        return rand;
    }
}

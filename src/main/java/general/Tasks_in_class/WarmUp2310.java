package general.Tasks_in_class;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WarmUp2310 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            ints.add(i);
        }
        // ArrayList<Integer> evenints = new ArrayList<>();
        //ArrayList<Integer> oddints = new ArrayList<>();
        // ints.forEach(item -> {if(item%2==0) oddints.add(item);});
        // ints.forEach(item -> {if(item%2!=0) evenints.add(item);});
        List<Integer> evenints = ints
                .stream()
                .filter(item -> item % 2 != 0)
                .collect(Collectors.toList());
        List<Integer> oddints = ints
                .stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());

        System.out.printf("All%s\n Even%s\n Odd%s\n", ints, evenints, oddints);

    }
}

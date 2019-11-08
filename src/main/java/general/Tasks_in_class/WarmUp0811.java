package general.Tasks_in_class;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp0811 {
    public static void main(String[] args) {
        String string = "World War II";
        System.out.println(filter(string));
        int s = 1123123;

    }

    static String filter(String origin) {
        return origin.replaceAll("[AEIOUaeiou]", "");
    }
//
//    String convert(String origin) {
//        Stream<String> stream ;
//        stream.map()
//    }

    boolean checkPrime(int origin) {
        for (int i = 2; i < origin; i++) {
            if (origin % i == 0)
                return false;
        }
        return true;
    }

//    static boolean checkPalindrome(int origin) {
//        for (int i = 0; i < String.valueOf(origin).length(); i++) {
//            if (String.valueOf(origin).charAt(i) == String.valueOf(origin).charAt(i - String.valueOf(origin).length())
//                    && i != String.valueOf(origin).length() / 2) {
//                return true;
//            } else return false;
//        }
//        return false;
//    }

    List<Integer> gen_prime(int count) {
        return IntStream.rangeClosed(1, count).filter(i -> checkPrime(count)).boxed().collect(Collectors.toList());
    }

}

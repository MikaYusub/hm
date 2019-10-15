import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int numbers = random.nextInt(11);
            System.out.print(numbers - 10 + " ");
        }
    }
}

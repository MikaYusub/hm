package general.Tasks_in_class;

import java.util.Random;

public class Point {
    private Random random = new Random();
    private int x = random.nextInt(51);
    private int y = random.nextInt(51);
    public int get_X() {
        return x;
    }
    public int get_Y() {
        return y;
    }
}

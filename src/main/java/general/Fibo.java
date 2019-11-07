package general;

public class Fibo {
    public static void main(String[] args) {
        Fibo app = new Fibo();
        int result = app.fibo(51);
        System.out.println(result);
    }

    private int fibo(int index) {
        if (index == 1 || index == 2) return 1;
        return fibo(index - 1) + fibo(index - 2);
    }
}

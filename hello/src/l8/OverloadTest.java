package l8;

public class OverloadTest {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1.5, 2));
        System.out.println(sum(1, 3, 5));
        System.out.println(sum(2, 4));
    }
}

package l3;

public class Teststatic {
    private static int i = 1;

    private static int a() {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(Teststatic.a());
    }
}

package l8;

import l6.Workman;

public class MethodTest {

    static int myMethod(int num1, int num2) {
        return (num1 + num2) * 250 / 17 + 3;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int result = myMethod(a, b);
        System.out.println(result);
        System.out.println("-----");
        System.out.println(myMethod(result, c));

        Workman workman = new Workman();
        workman.name = "Tom";
        workmanMethod(workman);
        System.out.println(workman.name);
    }

    static void workmanMethod(Workman workman1) {
        // workman1 = new Workman();
        workman1.name = "Jack";
    }
}

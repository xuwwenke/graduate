package l6;

public class Workman {
    public String name;
    int age;
    String position;

    public Workman() {
        System.out.println("我正在构造");
    }

    void work() {
        System.out.println("我正在从事" + this.position + "的工作");
    }

    void eat() {
        System.out.println("我正在睡觉");
    }

    void sleep() {
        System.out.println("zzzz......");
    }

    public static void main(String[] args) {
        Workman jack = new Workman();
        jack.position = "工人";
        jack.work();

    }
}
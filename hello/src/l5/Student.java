package l5;

public class Student {
    String id;
    String name;
    int age;

    void printId() {
        System.out.println(this.name + "的学号是" + this.id);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "张三";
        student1.id = "111111";
        student1.printId();
    }
}

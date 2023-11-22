package l9;

// import java.util.HashMap;

public class Student extends Workers {
    boolean isStudy;

    @Override
    void work() {
        System.out.println("我正在上课");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.work();
    }
}

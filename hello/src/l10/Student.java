package l10;

import java.util.Arrays;

// import java.lang.reflect.Array;

public class Student implements Comparable {

    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.score > student.score)
            return 1;
        if (this.score < student.score)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "name:" + name + ", score:" + score;
    }

    public static void main(String[] args) {
        Student student1 = new Student("张三", 80);
        Student student2 = new Student("李四", 90);
        Student student3 = new Student("王五", 85);

        Student students[] = new Student[] { student1, student2, student3 };

        Arrays.sort(students);
        Arrays.stream(students).forEach(System.out::println);
    }

}

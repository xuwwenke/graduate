package l7;

public class Person {
    String name;
    Integer age;

    Person() {
        System.out.println("我正在构造");
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("jack");
        System.out.println(person.name);
    }
}

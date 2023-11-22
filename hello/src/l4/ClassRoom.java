package l4;

public class ClassRoom {
    public void classBegin(Teacher teacher) {
        teacher.teachClass();
    }

    public static void main(String[] args) {
        new ClassRoom().classBegin(new ChinsesTeacher());
    }
}

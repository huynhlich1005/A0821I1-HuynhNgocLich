package access_modifile.exercise.e2;

public class Text {
    public static void main(String[] avgs){
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setName("Lich");
        student.setClasses("C0821i1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}

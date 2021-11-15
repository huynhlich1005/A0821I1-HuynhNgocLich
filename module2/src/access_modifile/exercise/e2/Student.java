package access_modifile.exercise.e2;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){}

    protected String getName() {
        return name;
    }

    protected String getClasses() {
        return classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}

package inheritance.exercise.e1;

public class Circle {
    private double r;
    private String color;
    public Circle(){}

    public Circle(double r, String color){
        this.r = r;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString(){
        return "Circle:   "+ "Radius: " + getR() + " Color: " + getColor();
    }
}

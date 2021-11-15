package access_modifile.exercise.e1;

import javax.swing.*;

public class Circle {
    public Circle(){}
    private double radius = 2.0;
    private String color = "red";
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    protected double getArea(){
        return radius;
    }
}

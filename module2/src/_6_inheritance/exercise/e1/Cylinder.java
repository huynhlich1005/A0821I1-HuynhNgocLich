package inheritance.exercise.e1;

public class Cylinder extends  Circle {
    private double h;

    public Cylinder(){
    }

    public Cylinder(double h){
        this.h = h;
    }

    public Cylinder(double r, String color , double h){
        super(r, color);
        this.h = h;
    }

    public double getH() {
        return h ;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double volume(){
        return h * this.getR() * this.getR() * 3.14;
    }

    @Override
    public String toString(){
        return "Cylinder:  " + "Radius: " + this.getR() + " Color: " + this.getColor() + " Height: " + this.getH();
    }
}

package class_and_object_in_java.practice.p1;

public class Rectangle {
    double width ;
    double height;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimetr(){
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" +height + "}";
    }
}

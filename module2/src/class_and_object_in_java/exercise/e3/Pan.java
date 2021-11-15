package class_and_object_in_java.exercise.e3;

public class Pan {
    int speed ;
    String color ;
    double radius ;
    boolean regime ;
    protected Pan(int speed, String color , double radius ,boolean regime){
        this.speed = speed;
        this.color = color;
        this.regime = regime;
        this.radius = radius;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isRegime() {
        return regime;
    }

    public void setRegime(boolean regime) {
        this.regime = regime;
    }
}

package class_and_object_in_java.exercise.e3;

public class TextPan {
    public static void main(String[] args){
        int speed = 1;
        String color = "blue";
        double radius = 5;
        boolean regime = false;
        Pan pan = new Pan(speed,color,radius, regime );
        System.out.println("Pan 1 : speed " + pan.getSpeed() + ",radius " + pan.getRadius() + ",color " + pan.getColor() + ",regime " + pan.isRegime());
        pan.setSpeed(3);
        pan.setRadius(10);
        pan.setColor("yellow");
        pan.setRegime(true);
        System.out.println("Pan 2 : speed " + pan.getSpeed() + ",radius " + pan.getRadius() + ",color " + pan.getColor() + ",regime " + pan.isRegime());
    }
}

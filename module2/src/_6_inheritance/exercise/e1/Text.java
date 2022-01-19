package inheritance.exercise.e1;

import java.util.Scanner;

public class Text {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r: ");
        double r = scanner.nextDouble();
        System.out.print("Enter color: ");
        String color = scanner.next();
        System.out.print("Enter h: ");
        double h = scanner.nextDouble();
        Circle circle = new Circle(r, color);
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(r , color ,h);
        System.out.println(cylinder);
        System.out.println("Cylindrical volume: " +cylinder.volume());
    }
}

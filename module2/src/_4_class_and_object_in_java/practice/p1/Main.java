package class_and_object_in_java.practice.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimetr());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

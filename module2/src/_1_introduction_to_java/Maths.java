package introduction_to_java;

import java.util.Scanner;

public class Maths {
    public static void main(String[] avgs){
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}

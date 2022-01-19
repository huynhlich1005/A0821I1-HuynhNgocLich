package class_and_object_in_java.exercise.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The quadratic equation 2 (ax2 + bx +c):");
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (a == 0){
            System.out.println("Equation of degree 1: " + ((-c) / b));
        }else {
            if (quadraticEquation.getDiscriminant() < 0){
                System.out.println("The equation has no real roots.");
            }else if (quadraticEquation.getDiscriminant() == 0){
                System.out.println("The equation has one root: " + quadraticEquation.getExperience());
            }else {
                System.out.println("The equation has two roots : " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
            }
        }
    }
}

package introduction_to_java;

import java.util.Scanner;

public class p7_calculate_weight {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        System.out.print("You weight (im kilogram):");
        weight = scanner.nextDouble();

        System.out.print("You height (in meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20.2f%s",bmi, "Underweight");
        }else if (bmi < 25.0){
            System.out.printf("%-20.2f%s" , bmi, "Normal");
        }else if (bmi < 30.0){
            System.out.printf("%-20.2f%s" , bmi,"Overweight");
        }else {
            System.out.printf("%-20.2f%s" ,bmi,"Obese");
        }
    }
}

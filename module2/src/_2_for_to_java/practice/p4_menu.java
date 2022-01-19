package for_to_java.practice;

import java.util.Scanner;

public class p4_menu {
    public static void main(String[] avgs){
        int choise = -1;
        Scanner input = new Scanner(System.in);

        while (choise != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choise = input.nextInt();

            switch (choise){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

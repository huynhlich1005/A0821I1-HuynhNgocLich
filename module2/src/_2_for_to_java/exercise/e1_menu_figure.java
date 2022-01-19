package for_to_java.exercise;

import java.util.Scanner;

public class e1_menu_figure {
    public static void main(String[] avgs){
        Scanner input = new Scanner(System.in);
        int choise = -1;
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
                    int width = 5;
                    int height = 3;
                    for (int i = 1; i <= height; i++){
                        for (int j = 1; j <= width; j++){
                            if (j <= width){
                                System.out.print("*");
                            }
                        }
                         System.out.print("\n");
                    }
                    break;
                case 2:
                    int height1 = 5;
                    for (int k = 1;k <= height1 ; k++) {

                        for (int l = 1 ; l <= k ; l++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    int height2 = 5;
                    for (int i = 1; i <= height2; i++ ){
                        for (int j = 1;j <= height2 - i ; j++){
                            System.out.print("  ");
                        }
                        for (int k = 1;k <= 2 * i - 1 ; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}

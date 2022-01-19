package arrays_and_methods_in_Java.exercise;

import java.util.Scanner;

public class e4_largest_element_in_a_two_dimensioal_array {
    public static void main(String[] avgs){
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter line number: ");
        m = scanner.nextInt();
        System.out.print("Enter column number: ");
        n = scanner.nextInt();

        int[][] array1 = new int [m][n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < m ; i++){
            for (int j = 0; j < n; j++){
                System.out.print("array[" + i + "][" + j + "]:  ");
                array1[i][j] = scanner.nextInt();
            }
        }

        int max = array1[0][0];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0; j < n; j++){
                if (max < array1[i][j]){
                    max = array1[i][j];
                }
            }
        }
        System.out.println("Largest elements: " + max);

    }
}

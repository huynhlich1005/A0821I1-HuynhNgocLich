package arrays_and_methods_in_Java.exercise_methods;

import java.util.Scanner;

public class e1_sum_of_column {
    public static void main(String[] avgs) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        System.out.print("Enter line number: ");
        m = scanner.nextInt();
        System.out.print("Enter column number: ");
        n = scanner.nextInt();

        int[][] array1 = new int[m][n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "]:  ");
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array you create: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + "    ");
            }
            System.out.println("\n");
        }

        System.out.print("Enter the column to be calculated: ");
        int k;
        do {
            k = scanner.nextInt();
        } while (k > n);
        int total1 = 0;
        for (int i = 0; i < m; i++) {
            total1 = total1 + array1[i][k];
        }

        System.out.print("Total column " + k + ":  ");
        System.out.print(total1);
    }
}

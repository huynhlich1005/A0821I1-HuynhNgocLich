package arrays_and_methods_in_Java.exercise_methods;

import java.util.Scanner;

public class e2_totalDiagonal {
    public static void main(String[] avgs){
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
        int total = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n ; j++){
                if (i == j ){
                    total = total + array1[i][j];
                }
            }
        }
        System.out.print("Total diagonal: " + total);
    }
}

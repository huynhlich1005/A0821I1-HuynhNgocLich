package arrays_and_methods_in_Java.exercise;

import java.util.Scanner;

public class e1_delete_element {
    public static void main(String[] avgs) {
        int n;
        int c;
        int i;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the number of elements in the array: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] Array1 = new int[n];

        System.out.println("Enter the element into the array: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            Array1[i] = scanner.nextInt();
        }
        System.out.println("Enter integer: ");
        int k = scanner.nextInt();

        for (c = i = 0;i < n; i++){
            if (Array1[i] != k){
                Array1[c] = Array1[i];
                c++;
            }
        }
        n = c;
        System.out.println("The remaining array is: ");
        for (i = 0 ; i < n ; i++){
            System.out.print(Array1[i] + "\t");
        }
    }
}

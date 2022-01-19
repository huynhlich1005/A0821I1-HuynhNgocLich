package arrays_and_methods_in_Java.exercise;

import java.util.Scanner;

public class e5_find_smallest_element_in_array {
    public static void main(String[] avgs) {
        int size = 20;
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the number of array: ");
            n = scanner.nextInt();
        }while (n > size);

        int[] Array1 = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("array [" + i + "]: ");
            Array1[i] = scanner.nextInt();
        }

        int min = Array1[0];
        for (int i = 1; i < n; i++){
            if (min > Array1[i]){
                min = Array1[i];
            }
        }
        System.out.println("the smallest element of the array is:  " + min);
    }
}

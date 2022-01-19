package for_to_java.exercise;

import java.util.Scanner;

public class e3_prime_numbers_less_than_100 {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.printf("All primes less than %d is: \n" , n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2){
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n){
        if (n < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2;i <= squareRoot ; i++ ){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}

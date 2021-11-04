package for_to_java.exercise;

import java.util.Scanner;

public class e2_prime {
    public static void main(String[] avgs){
        Scanner sc = new Scanner(System.in);
        int n;
        int status = 1;
        int num = 3;
        System.out.print("Enter the first n primes: ");
        n = sc.nextInt();

        if (n >=1){
            System.out.println(n + " The first prime number is");
        }
        for (int i = 2; i <= n; ){
            for (int j = 2; j <= Math.sqrt(num); j++){
                if (num % j == 0){
                    status = 0;
                    break;
                }
            }
            if (status != 0){
                System.out.println(num);
                i++;
            }
            status = 1;
            num ++;
        }
    }
}

package introduction_to_java;

import java.util.Scanner;

public class p6_leap_year {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            }else {
                System.out.printf("%d is a leap year", year);
                }
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

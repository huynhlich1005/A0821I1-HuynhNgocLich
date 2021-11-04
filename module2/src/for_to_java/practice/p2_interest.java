package for_to_java.practice;

import java.util.Scanner;

public class p2_interest {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        double money ;
        int month ;
        double interestRate ;
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextInt();
        double totalInterest = 0.0;
        for (int i = 0; i < month; i++){
            totalInterest += money * ( interestRate /100) /12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}

package introduction_to_java;

import java.util.Scanner;

public class e3_money_change {
    public static void main(String[] avgs){
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.print("Value vnd: " + change);
    }
}

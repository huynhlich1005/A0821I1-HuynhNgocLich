package introduction_to_java;

import java.util.Scanner;

public class e1_hello {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}

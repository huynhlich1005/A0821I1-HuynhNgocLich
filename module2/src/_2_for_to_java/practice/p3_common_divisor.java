package for_to_java.practice;

//import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class p3_common_divisor {

    public static void main(String[] avgs){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}

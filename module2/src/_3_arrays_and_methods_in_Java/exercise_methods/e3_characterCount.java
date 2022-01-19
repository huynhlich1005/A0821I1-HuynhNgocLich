package arrays_and_methods_in_Java.exercise_methods;

import java.util.Scanner;

public class e3_characterCount {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);
        String chain;
        String characters;
        int count = 0;
        System.out.println("enter any string: ");
        chain = scanner.nextLine();
        System.out.print("Enter the desired character: ");
        characters = scanner.nextLine();

        for (int i = 0; i < chain.length(); i++){
            if (chain.charAt(i) == characters.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}

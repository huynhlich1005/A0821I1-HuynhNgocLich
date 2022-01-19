package SearchAlgorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class Text {
    public static void main(String[] avgs){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        int length = string.length();
        for (int i = 0; i < length; i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i +1; i < length; i++){
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max){
            System.out.print(ch);
        }
        System.out.println();
    }

}

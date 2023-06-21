package Week1;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String split [] = s.split(" ");
        String longWord = "";
        for (String s2 : split) {
            if (s2.length() > longWord.length()){
                longWord = s2;
            }
        }
        System.out.println(longWord);
    }
}

package Week1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cm;
        double m;
        double celsius;
        double fahrenheit;
        double kg;
        double gram;
        while (true) {
            System.out.println("Select the converter:");
            System.out.println("press [1] to convert m to cm");
            System.out.println("press [2] to convert cm to m");
            System.out.println("press [3] to convert temp celsius to fahrenheit");
            System.out.println("press [4] to convert temp fahrenheit to celsius");
            System.out.println("press [5] to convert grams to kg");
            System.out.println("press [6] to convert kg to grams");
            System.out.println("press [0] to exit");
            int ch = scanner.nextInt();
            if (ch == 1) {
                System.out.print("Enter m: ");
                m = scanner.nextDouble();
                cm = m * 100;
                System.out.println("cm equal: " + cm);
                System.out.println();
            } else if (ch == 2) {
                System.out.print("Enter cm: ");
                cm = scanner.nextDouble();
                m = cm / 100;
                System.out.println("m equal: " + m);
            } else if (ch == 3) {
                System.out.print("Enter celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 1.8) + 32;
                System.out.println("Fahrenheit equal: " + fahrenheit);
            } else if (ch == 4) {
                System.out.print("Enter fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = ((fahrenheit + 32) - 32) * 1.8;
                System.out.println("Celsius equal: " + celsius);
            } else if (ch == 5) {
                System.out.print("Enter gram: ");
                gram = scanner.nextDouble();
                kg = gram / 1000;
                System.out.println("Kg equal: " + kg);
            } else if (ch == 6) {
                System.out.print("Enter kg: ");
                kg = scanner.nextDouble();
                gram = kg * 1000;
                System.out.println("Grams equal: " + gram);
            } else {
                break;
            }
        }


    }


}

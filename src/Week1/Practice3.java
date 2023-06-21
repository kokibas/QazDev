package Week1;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> substrings = Arrays.asList(s.split(" "));
        System.out.println(substrings);
    }
}

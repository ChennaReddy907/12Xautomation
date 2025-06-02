package Logic_java;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String input = scanner.nextLine();

        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println("Given word is Palindrome");
        } else {
            System.out.println("Given word is Not Palindrome");
        }
        scanner.close();
    }
}
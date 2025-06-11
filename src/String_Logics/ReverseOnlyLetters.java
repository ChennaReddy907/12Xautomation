package String_Logics;
import java.util.Scanner;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        System.out.println("\nOriginal: " + input);
        System.out.println("Step-by-step process:\n");

        for (; left < right;) {
            System.out.println("Left char: " + chars[left] + " | Right char: " + chars[right]);

            if (!Character.isLetter(chars[left])) {
                System.out.println("  → '" + chars[left] + "' at left is NOT a letter. Skipping left++.");
                left++;
            } else if (!Character.isLetter(chars[right])) {
                System.out.println("  → '" + chars[right] + "' at right is NOT a letter. Skipping right--.");
                right--;
            } else {
                System.out.println("  ✔ Both are letters. Swapping '" + chars[left] + "' and '" + chars[right] + "'");
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            System.out.println("  Current state: " + new String(chars));
            System.out.println("  left = " + left + ", right = " + right + "\n");
        }

        System.out.println("Final Reversed String (only letters reversed):");
        System.out.println(new String(chars));
    }
}
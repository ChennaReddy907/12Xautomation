package String_Logics;
import java.util.Scanner;
public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array");

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + "Numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(numbers[i]);
        }
    }
}
}
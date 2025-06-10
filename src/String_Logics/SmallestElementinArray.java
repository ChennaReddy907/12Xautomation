package String_Logics;
import java.util.Scanner;
public class SmallestElementinArray {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0];
        for (int i = 0; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest element is: "+ smallest);

    }
}
import java.util.Scanner;
public class While_FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();

        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}


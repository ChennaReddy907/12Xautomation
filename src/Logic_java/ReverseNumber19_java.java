package Logic_java;
import java.util.Scanner;
public class ReverseNumber19_java {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int number = scanner.nextInt();

        int reverse =0;
        for(;number!=0;number=number/10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println( reverse );
        scanner.close();
    }
}

package Logic_java;
import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = scanner.nextInt();

        int count=0;

        if(number<=1){
            System.out.println(number +" is not prime number");
            return;
        }

        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
            if(count == 0){
                System.out.println( number +" is prime number");
            }
            else
            {
                System.out.println(number +" is not prime number");
            }

        scanner.close();
    }


}

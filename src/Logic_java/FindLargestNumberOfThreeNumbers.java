package Logic_java;
import java.util.Scanner;
public class FindLargestNumberOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int Number1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int Number2 = scanner.nextInt();

        System.out.println("Enter Third Number");
        int Number3 = scanner.nextInt();

        int Largest = 0;

        if(Number1>=Number2 && Number1>=Number3){
            Largest = Number1;
        }
        else if(Number2>=Number1 && Number2>=Number3){
            Largest = Number2;
        }
        else{
            Largest = Number3;
        }
        System.out.println("Largest number is: "+ Largest);
    }
}

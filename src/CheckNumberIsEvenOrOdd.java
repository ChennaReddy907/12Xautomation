
import java.util.Scanner;
public class CheckNumberIsEvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();

    if(number%2 == 0){
        System.out.print("Even number");
    }
    else{
        System.out.print("Odd number");
    }


    }
}

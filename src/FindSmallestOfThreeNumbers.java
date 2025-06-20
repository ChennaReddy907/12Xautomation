
import java.util.Scanner;
public class FindSmallestOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        System.out.println("Enter Third Number");
        int c = scanner.nextInt();

        int Smallest =0;

        if(a<=b && a<=c){
            Smallest = a;
        }
        else if(b<=a && b<=c){
            Smallest = b;
        }
        else{
            Smallest =c;
        }
        System.out.print("Smallest Number is: "+ Smallest);
    }
}

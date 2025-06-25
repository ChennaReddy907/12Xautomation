
import java.util.Scanner;
public class PrintNumsFrom1to100_TakeInPut_FromUser {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print( "Enter starting Number");
    int sNumber = scanner.nextInt();

    System.out.println("Enter Ending Number");
    int eNumber = scanner.nextInt();

    for(int i=sNumber;i<=eNumber;i++){
        System.out.println(i + " ");
    }
    }
}

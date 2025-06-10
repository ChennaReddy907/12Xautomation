package String_Logics;
import java.util.Scanner;
public class PalindromeNumberCheck {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        int OriginalNumber=number;
        int reverse =0;

        while(number!=0) {
            int digit=number%10;
            reverse=reverse*10+digit;
            number = number/10;
        }
      if(reverse == OriginalNumber){
          System.out.print("given number is Palindorome");
      }
      else{
          System.out.print("given number not Palindrome");
      }
    }
}

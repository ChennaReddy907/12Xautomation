package Logic_java;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number num1:");
        System.out.println("Enter number num2:");


        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println( "Before Swaping" );
        System.out.println("num1:" + num1);
        System.out.println("num2 :"+ num2);


        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Ater swaping");
        System.out.println("num1:" + num1);
        System.out.println("num2 :"+ num2);
    }
}

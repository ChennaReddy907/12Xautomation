package Logic_java;

import java.util.Scanner;
public class Max_java{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter num1");
        int num1 = scanner.nextInt();

        System.out.println( "Enter num2");
        int num2 = scanner.nextInt();

        System.out.println( "Enter num3");
        int num3 = scanner.nextInt();

        int max = (num1>num2)? (num1>num3? num1:num3):(num2>num3? num2:num3);

        System.out.println("the maximum num is :"+max);
        scanner.close();
    }
}

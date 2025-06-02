package Logic_java;


import java.util.Scanner;

public class Factorial15_java {
    public static void main (String[]args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter number:");
        int n= scanner.nextInt();

        int fact = 1;

        if(n==0){
            fact = 1;
        }

        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);

    }
}

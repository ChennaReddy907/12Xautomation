package Logic_java;

import java.util.Scanner;

public class Grade18_java{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks:");

        int marks = scanner.nextInt();

        if(marks>=50 && marks<=59){
            System.out.println( "Grade:E");
        }
        else if (marks>=60 && marks<=69)
        {
            System.out.println( "Grade: D");
        }
        else if (marks>=70 && marks<=79)
        {
            System.out.println( "Grade: C");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println( "Grade:B");
        }
        else if(marks>=90 && marks <=100)
        {
            System.out.println( "Grade:A");
        }

        else if(marks>=101 && marks<=300){
            System.out.println("Grade:A++");
        }
        else if(marks<=301){
            System.out.println("Grade: Distinction");
        }
        else if(marks>=302) {
            System.out.println("Grade: State first");
        }
        else {
            System.out.println("Grade: fail");
        }


    }

}
import java.util.Scanner;

public class EligibleCheckToVote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scanner.nextInt();

        if(age<=0){
            System.out.println("Invalid Age Entered");
        }

        else if(age>=18){
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible for Voting");
        }
    }
}

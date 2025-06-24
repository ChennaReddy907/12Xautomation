import java.util.Scanner;
public class DayOfWeek_IfElse {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter days from(1 to 7)");
    int day = scanner.nextInt();

    if(day == 1){
        System.out.print("Monday");
    }
    else if(day == 2){
        System.out.print("Tuesday");
    }
    else if(day == 3){
        System.out.println("Wednesday");
    }
    else if(day == 4){
        System.out.println("Thursday");
    }
    else if(day == 5){
        System.out.println("Friday");
    }
    else if(day == 6){
        System.out.println("Saturday");
    }
    else if(day == 7){
        System.out.println("Sunday");
    }
     else{
         System.out.println("Invalid day");
    }
}


}

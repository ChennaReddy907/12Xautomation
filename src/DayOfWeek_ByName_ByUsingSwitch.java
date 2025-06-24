import java.util.Scanner;
public class DayOfWeek_ByName_ByUsingSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day Name(Ex:Monday)");
        String dayName = scanner.nextLine().toLowerCase();

        switch(dayName){
            case "Sunday":
                System.out.println("Sunday is: day 1 ");
                break;
            case "monday":
                System.out.println("Monday is: day 2");
                break;

            case "tuesday":
                System.out.println("Tuesday is: day 3");
                break;

            case "wednesday":
                System.out.println("Wednesday is:day 4");
                break;
            case "thuresday":
                System.out.println("Thuresday is: day 5");
                break;
            case "friday":
                System.out.println("Friday is:day 6");
                break;
            case "saturday":
                System.out.println("Saturday is: day 7");
                break;
            default:
                System.out.println("Invalid day name");

        }
    }
}

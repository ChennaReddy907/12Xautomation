import java.util.Scanner;
public class NumbersReverseOrderPrint {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Start Number");
    int start = scanner.nextInt();
    System.out.println("Enter End Number");
    int end = scanner.nextInt();

    for(int i=end;i>=start;i--){
        System.out.println(i);
    }
}
}

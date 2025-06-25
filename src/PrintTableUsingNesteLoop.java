
import java.util.Scanner;
public class PrintTableUsingNesteLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number");
        int start = scanner.nextInt();
        System.out.println("Enter end number");
        int end = scanner.nextInt();


        for(int i=start;i<=end;i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
            scanner.close();
        }
    }
}

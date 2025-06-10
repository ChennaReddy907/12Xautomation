package String_Logics;
import java.util.Scanner;
public class ReverseArrayElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of Array: ");

        int size = scanner.nextInt();

        int[]numbers=new int[size];

        System.out.println("Enter " + size + " numbers:");

        for(int i=0;i<size;i++){
           numbers[i]=scanner.nextInt();
        }
    for(int i=size-1;i>=0;i--) {
        System.out.println(numbers[i]);
    }
    }
}

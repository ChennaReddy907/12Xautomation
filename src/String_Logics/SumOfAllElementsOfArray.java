package String_Logics;
import java.util.Scanner;
public class SumOfAllElementsOfArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();

        int[]numbers = new int[size];
        System.out.println("Enter "+ size +" Numbers");

        for(int i= 0;i<size;i++){
             numbers[i]=scanner.nextInt();
        }

        int sum =0;

        for(int i=0;i<size;i++){
            sum=sum+numbers[i];
        }
      System.out.println("sum of all elements is: "+sum);
        scanner.close();
    }
}

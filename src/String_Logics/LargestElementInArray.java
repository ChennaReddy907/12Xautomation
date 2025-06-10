package String_Logics;
import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array");

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers");
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        int largest = numbers[0];

      for(int i=0;i<size;i++){
         if(numbers[i]>largest){
             largest =numbers[i];
         }
      }
      System.out.println("Largest number is:"+ largest);
      scanner.close();
    }
}

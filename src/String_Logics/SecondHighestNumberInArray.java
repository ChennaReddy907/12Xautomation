package String_Logics;
import java.util.Scanner;
public class SecondHighestNumberInArray {
    public static void main(String[ ] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = scanner.nextInt();

        int[ ] numbers =new int[size];
        System.out.println("Enter "+ size + "Numbers");

        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }

        int largest = numbers[0];
        for(int i=1;i<size;i++){
            if(numbers[i]>largest){
                largest =numbers[i];
            }
        }

        int second =Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(numbers[i]>second && numbers[i]<largest){
                second=numbers[i];
            }
        }
        System.out.println(second);
    }
}


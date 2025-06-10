package String_Logics;
import java.util.Scanner;
public class EvenOddNumOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int size =scanner.nextInt();

        int[]numbers=new int[size];

        System.out.println("enter "+ size+ "numbers");
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }

        for(int i =0;i<size;i++){
            if(numbers[i]%2==0){
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
        }

        scanner.close();
    }
}



import java.util.Scanner;
public class PrintMultiplicationOf5Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
      System.out.println("Multiplication of " +num+ ":");

      for( int i =1;i<=10;i++){
          System.out.println(num + " X " + i + " = "+(num*i));
      }

    }
}

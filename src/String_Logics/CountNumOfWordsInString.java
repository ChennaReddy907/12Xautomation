package String_Logics;
import java.util.Scanner;
public class CountNumOfWordsInString {

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String input = scanner.nextLine();

        String []store=input.split("\\s+");
        int count = store.length;
          System.out.println("NUM OF WORDS IN THE STRING ARE :"+ count);
}
}

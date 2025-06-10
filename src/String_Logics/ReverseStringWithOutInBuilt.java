package String_Logics;
import java.util.Scanner;
public class ReverseStringWithOutInBuilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input=scanner.nextLine();

        input =input.toLowerCase();

        char[]chars = new char[input.length()];
        for(int i=0;i<input.length();i++){
            chars[i]=input.substring(i,i+1).toCharArray()[0];
        }

        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }
       scanner.close();
    }
}

import java.util.Scanner;
public class CheckIfCharacterIsAlphabetOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Character");
        char ch = scanner.next().charAt(0);

        ch=Character.toLowerCase(ch);

        if(ch>= 'a' && ch<= 'z')
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Not Alphabet");
        }
    }
}

import java.util.Scanner;
public class CheckCharacterIsVowelOrConsonant{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)){
            System.out.println("Not a Character");
        }
     else if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u'){
         System.out.println("Vowel");
        }
     else{
         System.out.println("Consonant");
        }

    }
}

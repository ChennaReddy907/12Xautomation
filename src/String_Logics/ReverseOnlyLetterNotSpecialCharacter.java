package String_Logics;
import java.util.Scanner;
public class ReverseOnlyLetterNotSpecialCharacter {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter and word with Special character: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        int left=0;
        int right=chars.length-1;

        while(left<right){
            if(!Character.isLetter(chars[left])){
                left++;
            }
            else if(!Character.isLetter(chars[right])){
                right++;
            }
            else{
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}

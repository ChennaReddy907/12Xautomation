package String_Logics;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
Scanner scanner  = new Scanner(System.in);
System.out.println("Enter the number to check Armstrong");

int number =scanner.nextInt();
int OriginalNumber = number;
int result=0;

int digits=0;

int temp =number;
while(temp>0){
    temp=temp/10;
    digits++;
}
temp=number;
while(temp>0){
    int digit = temp%10;
    result+=Math.pow(digit, digits);
    temp=temp/10;
}
if(result == OriginalNumber){

    System.out.println("Armstrong Number");
}
else{
    System.out.println("Not Armstrong Number");
}
scanner.close();

}
}

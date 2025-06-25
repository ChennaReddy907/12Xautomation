import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2");
        int num2 = scanner.nextInt();

        System.out.println( "Enter operator( '+','-','*','/')");
        char operator= scanner.next().charAt(0);


        double result;

        switch(operator){
            case '+':
                result = num1+num2;
                System.out.println("result = "+ result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("result= "+ result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("result=" + result);
                break;
            case '/':
                if(num2!=0) {
                    result = num1 / num2;
                    System.out.println("result = " + result);
                }
                else{
                        System.out.print("cannot devide");
                    }
                     break;
            default :
                System.out.println("invalid");
        }
    }
}

package String_Logics;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args){

        int sum=0;

        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.print("sum of first 10 natural numbers is:" +sum);
    }
}

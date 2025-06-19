public class UseWhieLoopToSumOfFirst10NaturalNumbers {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.print("Sum of 10 natural num is: "+  sum);
    }
}

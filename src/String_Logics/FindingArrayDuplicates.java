package String_Logics;
import java.util.Scanner;
public class FindingArrayDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = scanner.nextInt();

        int[]numbers = new int[size];
        System.out.println("enter "+ size +" numbers");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
        boolean[]visited = new boolean[size];
        for(int i=0;i<numbers.length;i++){
            if(visited[i]){
                continue;
            }

            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    System.out.print(numbers[i]);
                    visited[j]=true;
                    break;
                }
            }
        }

    }
}


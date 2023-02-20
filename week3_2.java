
import java.util.Scanner;

public class week3_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input the first number:");
        int first=sc.nextInt();
        System.out.println("input the last number");
        int last=sc.nextInt();
        int[] arr=new int[]{};
        for(int i=first;i<=last;i++)
        {
            if(i%2==0) System.out.print(i+"\t");
        }
    }
}
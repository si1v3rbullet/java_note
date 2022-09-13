package java_test;

import java.util.Scanner;

public class week3_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input the first number:");
        int first=sc.nextInt();
        System.out.println("input the last number");
        int last=sc.nextInt();
        int[] arr=new int[]{};
        int temp=0;
        for(int i=first;i<=last;i++)
        {
            temp++;
            if(temp==4&&i*3<=100)
            {
                System.out.print(i*3+"\t");
                temp=0;
            }
            else System.out.print(i+"\t");
        }
    }
}
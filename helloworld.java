
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(2333);
        double a=4.5;
        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入密码");
        int password=sc.nextInt();
        System.out.println("你的密码是："+password);
        System.out.println("请输入字符串");
        String f=sc.next();
        System.out.println("字符串是:"+f);
    }
}
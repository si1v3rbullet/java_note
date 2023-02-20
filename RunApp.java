package java_test;

import java.util.Scanner;
import calculator.calculator;

public class RunApp {
    private static boolean parse_operators(String a){
        if(a.equals("+")||a.equals("-")||a.equals("*")) return true;
        else return false;
    }
    public static void main(String[] args) {
        calculator cal=new calculator();
        Scanner sc=new Scanner(System.in);
        while(true){
            try {
                System.out.println("input the first number:");
                int cal1=sc.nextInt();
                if(!cal.judge(cal1)){
                    System.out.println("This calculator can work only with numbers in the range 0-60.");
                    break;
                }

                System.out.println("input the method:");
                String cal0=sc.next();
                if(!parse_operators(cal0)){
                    System.out.println("input '+','-' or '*'");
                    break;
                }

                System.out.println("input the third number:");
                int cal2 = sc.nextInt();
                if(!cal.judge(cal2)){
                    System.out.println("This calculator can work only with numbers in the range 0-60.");
                    break;
                }

                switch (cal0){
                    case "+":
                        System.out.println(cal.add(cal1,cal2));
                        System.out.println("Calculated using Magic Calculator version"+cal.version);
                        break;
                    case "-":
                        System.out.println(cal.subtract(cal1,cal2));
                        System.out.println("Calculated using Magic Calculator version"+cal.version);
                        break;
                    case "*":
                        System.out.println(cal.multiply(cal1,cal2));
                        System.out.println("Calculated using Magic Calculator version"+cal.version);
                        break;
                }

                System.out.println("want to quit? input 'exit'");
                String choices=sc.next();
                if(choices.equals("exit")) break;
            }
            catch (Exception e){
                System.out.println("please give the valid input");
                break;
            }
        }
    }
}
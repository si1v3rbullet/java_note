package java_test;

public class calculator {
    public String version="the calculator version is 1.3.2";


    public static boolean judge(int a){
        if(a>60||a<0) return false;
        return true;
    }
    public static int add(int a,int b){   //add a and b
        return a+b;
    }
    public static int subtract(int a,int b){  //a subtract b
        return a-b;
    }
    public static int multiply(int a,int b){   //a multiply b
        return a*b;
    }

    public static void main(String[] args) {

    }
}
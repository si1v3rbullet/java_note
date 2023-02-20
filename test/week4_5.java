public class week4_5 {
    public static int Collatz(int n,int count){
        if(n==1){
            System.out.println("recursion success!");
            System.out.println(count);
        }
        else{
            switch (n%2){
                case 0:
                    return Collatz(n/2,count+1);
                case 1:
                    return Collatz(3*n+1,count+1);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Collatz(10,0);
    }
}

public class week4_3 {
    public static int Collatz(int n){
        try {
            if(n==1){
                System.out.println(1);
                return 1;
            }
            else{
                switch (n%2){
                    case 0:
                        System.out.println(n);
                        return Collatz(n/2);
                    case 1:
                        System.out.println(n);
                        return Collatz(3*n+1);
                }
            }

        }
        catch(Exception e) {
            System.out.println("Please use valid n.");
        }
        return 1;
    }
    public static void main(String[] args) {
        Collatz(10);
    }
}
import java.util.Scanner;


public class week4_1 {

    public static void get_info(Account acc){
        System.out.println(acc.getMoney()+"\t"+acc.getName());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();
        Account myAccount2 = new Account();
        myAccount2.setName("bbb");
        myAccount2.setMoney(1200);

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); // outputs a blank line

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

        System.out.printf("Initial money is: %s%n%n", myAccount.getMoney());

        System.out.println("Please enter the money you have:");
        myAccount.setMoney(input.nextInt());
        System.out.println();
        System.out.printf("money in object myAccount is:%n%s%n", myAccount.getMoney());

        System.out.println("Please input the money you want");
        int money_want= input.nextInt();
        System.out.println("the result is "+myAccount.get_the_money(money_want));

        get_info(myAccount);
        get_info(myAccount2);

    }
}
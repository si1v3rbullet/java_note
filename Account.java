public class Account {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;

    public void increase_money(int x){
        money+=x;
    }
    public int get_the_money(int a){
        if(a<=money){
            return a;
        }
        else{
            System.out.println("Withdrawal amount exceeded account balance.");
            return 0;
        }
    }
}

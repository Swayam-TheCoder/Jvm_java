package Question_OOPs.encap.bank;

public class Bankaccount {
    private String accno;
    private String accHolName;
    private double balance;

    public Bankaccount(String accno, String accHolName, double balance) {
        this.accno = accno;
        this.accHolName = accHolName;
        this.balance = balance;
    }

    public void deposit(double money){
        if(money <= 0){
            System.out.println("invalid deposit");
        }
        balance += money;
    }

    public double withdraw(double money){
        if(balance >= money){
            balance -= money;
        } else if(money <= 0){
            System.out.println("invalid");
        } else{
            money = balance;
            balance = 0;
        }
        return money;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bankaccount{");
        sb.append("balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }


}

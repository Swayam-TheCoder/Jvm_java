package Questions_Intermediate.OOPS.Encapsulation.com.example;

public class BankAccount {
    int accno;
    String holdername;
    double balance = 0;

    public BankAccount(int accno, String holdername) {
        this.accno = accno;
        this.holdername = holdername;
    }

    public void deposit(double money){
        balance += money;
    }

    public void withdraw(double money){
        if(balance < money || money <= 0){
            System.out.println("Don't have enough money");
        }else{
            balance -= money;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount --> ");
        sb.append("account_number: ").append(accno);
        sb.append(", holder_name: '").append(holdername).append('\'');
        sb.append(", balance: ").append(balance);
        return sb.toString();
    }


    public static void main(String[] args) {
        BankAccount bk = new BankAccount(123, "Swayam");
        bk.deposit(1000);
        bk.withdraw(800);
        System.out.println(bk.toString());
    }
}

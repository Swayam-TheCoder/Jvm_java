package Question_OOPs.encap.bank;

public class check {
    public static void main(String[] args) {
        Bankaccount bk = new Bankaccount("123456789", "Swayam", 1000);
        bk.deposit(100);
        System.out.println(bk.withdraw(900));
        System.out.println(bk);
    }
}
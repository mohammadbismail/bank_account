import javax.crypto.AEADBadTagException;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(50, 40);
        BankAccount account2 = new BankAccount(100, 66.5);
        BankAccount account3 = new BankAccount(20.2, 30.5);
        BankAccount account4 = new BankAccount(10.3, 40);
        System.out.println(BankAccount.NumOfAccounts);
        System.out.println(BankAccount.totalMoney);
        account1.addBalance(20, 'C');
        account1.showBalance();
        account1.withDrawMoney(200, 'c');
    }
}

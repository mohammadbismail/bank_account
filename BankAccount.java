import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    public static int NumOfAccounts = 0;
    public static double totalMoney = 0;

    // Constructors
    public BankAccount(double myCheckingBalance, double mySavingBalance) {
        this.checkingBalance = myCheckingBalance;
        this.savingBalance = mySavingBalance;
        NumOfAccounts++;
        totalMoney += myCheckingBalance + mySavingBalance;
    }
    // Setters & getters
    // public int getAccountCount() {
    // return NumOfAccounts;
    // }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void addBalance(double amount, char accountLetter) {
        // Scanner getInput = new Scanner(System.in);
        // System.out.print("Please type 'S' to add to Saving balance and 'C' for
        // checking balance");
        // char ch = getInput.next().charAt(0);
        if (accountLetter == 'C' || accountLetter == 'c') {
            this.checkingBalance += amount;
        } else if (accountLetter == 'S' || accountLetter == 's') {
            this.savingBalance += amount;
        }
        // getInput.close();
        totalMoney += amount;
    }

    public void withDrawMoney(double amount,char accountLetter) {
        // Scanner getInput = new Scanner(System.in);
        // System.out.print("Please type 'S' to add to Saving balance and 'C' for checking balance");
        // char ch = getInput.next().charAt(0);
        if (accountLetter == 'C' || accountLetter == 'c' && this.checkingBalance >= amount) {
            this.checkingBalance -= amount;
        } else if (accountLetter == 'S' || accountLetter == 's' && this.checkingBalance >= amount) {
            this.savingBalance -= amount;
        } else {
            System.out.println("Your balance is not enough to do such withdraw");
        }
        // getInput.close();
        totalMoney -= amount;
    }

    public void showBalance() {
        System.out.println("CheckingBalance is: " + this.checkingBalance);
        System.out.println("SavingBalance is: " + this.savingBalance);
    }
}
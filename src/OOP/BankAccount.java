package OOP;

public class BankAccount {
    private int id = 0;
    private int balance;


    public BankAccount( int balance){
        id ++ ;
        this.balance = balance;
    }

    public BankAccount () {
        id++;
        balance= 0;
    }

    public void withdraw (int withdraw){
        if (balance >= withdraw){
            balance -= withdraw;
            System.out.println("Successfully withdrawn , Available balance = " + balance);
        } else {
            System.out.println("insufficient balance");
        }
    }
    public void deposite (int deposit){
        if (deposit > 0){
            balance += deposit ;
            System.out.println("Deposit was succedfull your balance = " + balance);
        }else {
            System.out.println("Error enter a valid number");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
}
import java.io.Serializable;

public class Account implements Serializable {
    int accNum;
    int balance = 0;

    public Account(int accNum, int balance)
    {
        this.accNum = accNum;
        this.balance = balance;
    }

    public int getAccNum() {return accNum;}
    public int getBalance() {
        return balance;
    }

    public void accInfo()
    {
        System.out.println("Account Num: " + accNum);
        System.out.println("Balance: " + balance);
    }

    public void deposit(int amount)
    {
        balance += amount;
    }

    public void withdraw(int amount)
    {
        balance -= amount;
    }

    public void sendMoney(int amount, Account toWhom)
    {
        this.withdraw(amount);
        toWhom.deposit(amount);
    }

    public int compareTo(Account o) {
        return accNum - o.accNum;
    }

    @Override
    public String toString()
    {
        return "Account [account number=" + accNum + "]";
    }
}

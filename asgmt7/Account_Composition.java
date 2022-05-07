import java.util.Date;

public class Account_Composition
{
    protected int accNum, balance;
    Transactions txns;

	public Account_Composition(int amount) 
    {
        txns = new Transactions(); 
        balance = amount;
    }

	public void withdraw(int amount) 
    {
        if (balance >= amount)
        {
            balance -= amount;
            txns.add(new Record("출금", new Date(), amount));
        }
        else
            System.out.println("not enough balance");
    }

    public void deposit(int amount) 
    {
        balance += amount;
        txns.add(new Record("입금", new Date(), amount));
    }

    public void sendMoney(int amount, Account acc)
    {
        if (balance >= amount)
        {
            balance -= amount;
            acc.balance += amount;
            txns.add(new Record("송금", new Date(), amount));
        }
        else
            System.out.println("not enough balance");
    }

    public void sendMoney(int amount, Account_Composition acc)
    {
        if (balance >= amount)
        {
            balance -= amount;
            acc.balance += amount;
            txns.add(new Record("송금", new Date(), amount));
        }
        else
            System.out.println("not enough balance");
    }

    public int getBalance() {return balance;}
    public int getAccNum() {return accNum;}

    public void showTransactions()
    {
        txns.show();
    }

    @Override
    public String toString()
    {
        return "[Account Number: " + accNum + "\tBalance: " + balance;
    }
}
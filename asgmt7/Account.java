
public class Account{
    protected int accNum, balance;

	public Account(int amount) { balance = amount; }

	public void withdraw(int amount) 
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("not enough balance");
    }
    public void deposit(int amount) {balance += amount;}
    public void sendMoney(int amount, Account acc)
    {
        if (balance >= amount)
        {
            balance -= amount;
            acc.balance += amount;
        }
        else
            System.out.println("not enough balance");
    }
    public int getBalance() {return balance;}
    public int getAccNum() {return accNum;}


}
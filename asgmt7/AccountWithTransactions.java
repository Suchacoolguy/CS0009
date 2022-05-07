import java.time.LocalDate;
import java.util.Date;
import java.util.TreeSet;

public class AccountWithTransactions  extends Account{
    private TreeSet<Record> transactions = new TreeSet<>(new RecordComparator());

    public AccountWithTransactions(int amount)
    {
        super(amount);
    }

    @Override
    public void withdraw(int amount)
    {
        super.withdraw(amount);
        transactions.add(new Record("출금", new Date(), amount));
    }

    @Override
    public void deposit(int amount)
    {
        super.deposit(amount);
        transactions.add(new Record("입금", new Date(), amount));
    }

    @Override
    public void sendMoney(int amount, Account acc)
    {
        if (balance >= amount)
        {
            balance -= amount;
            acc.balance += amount;
        }
        else
            System.out.println("not enough balance");
        transactions.add(new Record("송금", new Date(), amount));
    }


}
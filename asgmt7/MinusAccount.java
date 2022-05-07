public class MinusAccount extends Account{
    private int creditLimit;

    public MinusAccount(int amount, int creditLimit)
    {
        super(amount);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(int amount)
    {
        if (balance + creditLimit >= amount)
            balance -= amount;
    }
}

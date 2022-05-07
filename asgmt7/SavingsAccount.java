import java.time.LocalDate;

public class SavingsAccount extends Account{
    LocalDate contractDate;
    LocalDate expirationDate;
    int monthlyPayment;
    double interestRate;
    public SavingsAccount(int amount, LocalDate contractDate, LocalDate expirationDate, int monthlyPayment, double interestRate)
    {
        super(amount);
        this.contractDate = contractDate;
        this.expirationDate = expirationDate;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(int amount) 
    {
        if ((expirationDate.equals(LocalDate.now())) && (balance >= amount))
            balance -= amount;
        else if (balance < amount)
            System.out.println("not enough balance");
        else
            System.out.println("출금은 만기일에만 가능함.");
    }

    @Override
    public void deposit(int amount)
    {
        if (contractDate.getDayOfMonth() == LocalDate.now().getDayOfMonth())
        {
            balance += monthlyPayment;
            System.out.println("입금완료");
        }
        else
            System.out.println("입금일이 아닙니다.");
    }

    public void addInterest()
    {
        balance += (int) (balance * interestRate);
    }
}

import java.time.LocalDate;

public class testing {
    public static void main(String[] args) {

        SavingsAccount abc = new SavingsAccount(10000, LocalDate.now().plusMonths(2), LocalDate.now().plusMonths(6), 5000, 0.07);

        abc.deposit(20000);

    }
    
}

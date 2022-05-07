import java.util.ArrayList;

public class Customer {
    int custID;
    String name;
    String password;
    String contact;
    int creditRating;
    ArrayList<Account_Composition> accounts = new ArrayList<>();
    
    public Customer(int custID, String name, String password, String contact, int creditRating, Account_Composition... accounts)
    {
        this.custID = custID;
        this.name = name;
        this.password = password;
        this.contact = contact;
        this.creditRating = creditRating;
        for (Account_Composition acc : accounts)
        {
            this.accounts.add(acc);
        }
    }

    public void showAccounts()
    {
        for (Account_Composition acc : accounts)
        {
            acc.toString();
        }
    }

    public void showTransactions()
    {
        for (Account_Composition acc : accounts)
        {
            acc.txns.show();
        }
    }
}

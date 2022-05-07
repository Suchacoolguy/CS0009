public class test {
    public static void main(String[] args) {

        Account_Composition acc_comp = new Account_Composition(10000);
        acc_comp.deposit(10000);
        acc_comp.showTransactions();
        Account_Composition acc_comp2 = new Account_Composition(25000);
        acc_comp2.withdraw(10000);
        acc_comp2.showTransactions();
        Customer cust = new Customer(1, "Tom", "1234", "112", 1, acc_comp, acc_comp2);
        cust.showAccounts();
        cust.accounts.get(0).sendMoney(500, cust.accounts.get(1));
        
        System.out.println(cust.accounts.get(0).getBalance());
        System.out.println(cust.accounts.get(1).getBalance());
        
        
        
    }
    
}

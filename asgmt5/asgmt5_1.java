import java.util.List;
import java.util.Scanner;

public class asgmt5_1 {
    public static void main(String[] args) {
        Account myAcc = new Account("Shawn");
        Account aliAcc = new Account("Ali");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Set Balance: ");
        myAcc.deposit(scanner.nextInt());

        Customer shawn = new Customer(myAcc);
        Customer ali = new Customer(aliAcc);
        shawn.sendMoney(15000, ali);

        System.out.println("ali's balance: " + aliAcc.getBalance());
    }
}

class Account{
    private  int      accNum;
    private  String  owner;
    private  int      balance;
    private static int currentNumber = 0;
    

/* 행동 모델링: getters(상태 검색) and setters(상태 변경) */
public  int      getAccNum()  { return accNum; }
public  int      getBalance()   { return balance; }
public  String  getOwner()    { return owner; }

public void  deposit(int amount) { balance += amount; } 
public void  withdraw(int amount) { balance  -= amount; }
private static int nextNumber() { return ++currentNumber; }
/* 생성자 - 상태 초기화 */
public Account(String owner) {
    accNum = nextNumber();
    this.owner = owner; 	// this) 현재 객체를 가리키는 
			//        참조 변수
/* 정적 멤버 */
 
}


}

class Customer{
    private String name;
    private Account acc;

    Customer(Account acc)
    {
        this.name = acc.getOwner();
        this.acc = acc;
    }
    

    public void sendMoney(int money, Customer toWhom)
    {
        if (acc.getBalance() >= money)
        {
            acc.withdraw(money);
            toWhom.getAcc().deposit(money);

            System.out.println("***  Successfully Sent $" + money + " to " + toWhom.getAcc().getOwner() + "  ***");
            System.out.println("Balance: " + acc.getBalance());
            
        }
        else
            System.out.println("Error: Not Enough Balance.");
            
    }

    Account getAcc() { return this.acc; }

    
}

import java.util.List;
import java.util.Scanner;

public class asgmt5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer shawn = new Customer("Shawn");
        Customer ali = new Customer("Ali");

        System.out.println("Set Balance: ");
        shawn.acc.deposit(scanner.nextInt());

        System.out.println("How much do you want to send?");
        int sendingMoney = scanner.nextInt();
        shawn.sendMoney(sendingMoney, ali);

        System.out.println("ali's balance: " + ali.acc.getBalance());
    }
}



class Account{
    private  int      accNum;
    private  String  owner;
    private  int      balance = 0;
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
    public String name;
    public Account acc;

    Customer(String name)
    {
        this.name = name;
        this.acc = new Account(name);
    }
    

    public void sendMoney(int money, Customer toWhom)
    {
        if (acc.getBalance() >= money)
        {
            acc.withdraw(money);
            toWhom.getAcc().deposit(money);

            System.out.println("***  Successfully Sent $" + money + " to " + toWhom.getAcc().getOwner() + "  ***");
            System.out.println("My Balance: " + acc.getBalance());
            
        }
        else
            System.out.println("Error: Not Enough Balance.");
            
    }

    Account getAcc() { return this.acc; }

    
}

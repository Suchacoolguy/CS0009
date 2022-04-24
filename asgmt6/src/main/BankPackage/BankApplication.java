import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class BankApplication {
    private static Account[] accountArr = new Account[10];
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        while (true) {
			System.out.println("+---------------------------------------+");
			System.out.println("1.계좌생성 | 2.잔고 조회 | 3.예금 | 4.출금 | 5.계좌이체 | 6.종료");
			System.out.println("+---------------------------------------+");
			System.out.print("선택> ");

            int select = scanner.nextInt();

            if (select == 1)
                createAccount();
            else if (select == 2)
                accountInfo();
            else if (select == 3)
                deposit();
            else if (selectNo == 4)
                withdraw();
            else if (selectNo == 6)
                break;
    }
    System.out.println("프로그램 종료");

    
}
private static void createAccount() {
    System.out.println("--------");
    System.out.println("계좌생성");
    System.out.println("--------");
    System.out.print("계좌번호: ");
    int accNum = scanner.nextInt();

    System.out.print("잔고 설정: ");
    int balance = scanner.nextInt();

    for (int i = 0; i < accountArr.length; i++) {
        if (accountArr[i] == null) {
            accountArr[i] = new Account(accNum, balance);
            System.out.println("결과: 계좌가 생성되었습니다.");
            break;
        }
    }
}

static void accountInfo()
{
    System.out.println("--------");
	System.out.println("계좌번호 입력");
	System.out.println("--------");

    Scanner sc = new Scanner(System.in);
    int accNum = sc.nextInt();

    map.getAccNum


}

private static void deposit() {
    System.out.println("--------");
    System.out.println("예금");
    System.out.println("--------");
    System.out.print("계좌번호: ");
    String accNum = scanner.next();
    System.out.print("예금액: ");
    int dep = scanner.nextInt();

    if (findAccount(accNum) == null) {
        System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
        findAccount(accNum).setBalance(findAccount(accNum).getBalance() + dep);
        System.out.println("결과: 입금이 성공되었습니다.");
    }
    
}



}

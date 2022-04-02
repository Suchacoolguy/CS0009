import java.util.Scanner;

public class Ch4_04 {
    public static void main(String[] args) {
        System.out.print("Input equation? ");
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt())                      // 정수가 아닌 수가 입력되었을 때 예외처리
        {
            System.out.println("Please enter integers only.");
            return;
        }
        int firstNum = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        if (!scanner.hasNextInt())                      // 정수가 아닌 수가 입력되었을 때 예외처리
        {
            System.out.println("Please enter integers only.");
            return;
        }
        int secondNum = scanner.nextInt();

        if (operator == '+') {System.out.printf("%d+%d=%d", firstNum, secondNum, firstNum + secondNum);}
        else if (operator == '-') {System.out.printf("%d-%d=%d", firstNum, secondNum, firstNum - secondNum);}
        else if (operator == '*') {System.out.printf("%d*%d=%d", firstNum, secondNum, firstNum * secondNum);}
        else if (operator == '/') {System.out.printf("%d/%d=%d", firstNum, secondNum, firstNum / secondNum);}
        else {System.out.println("Invalid equation");}

    }
}

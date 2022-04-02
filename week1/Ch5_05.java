import java.util.Scanner;

public class Ch5_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;
        String yesOrNo;

        while (true)       // 탈출조건 만나기 전까지 무한루프
        {
            System.out.print("Input Equation (num1 op num2)? ");
            num1 = scanner.nextDouble();
            operator = scanner.next().charAt(0);              //char형을 입력받기
            num2 = scanner.nextDouble();

            if (operator == '+') {System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1 + num2);}
            else if (operator == '-') {System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, num1 - num2);}
            else if (operator == '*') {System.out.printf("%.1f * %.1f = %.1f\n", num1, num2, num1 * num2);}
            else if (operator == '/') {System.out.printf("%.1f / %.1f = %f\n", num1, num2, num1 / num2);}
            else {System.out.println("Invalid equation");}

            System.out.println("반복수행? (Yes / No)");
            yesOrNo = scanner.next();
            if (yesOrNo.equals("No"))
                return;
            else if (yesOrNo.equals("Yes"))
                continue;
            else {
                System.out.println("잘못된 입력입니다.");           // Yes or No만 유효
                return;
            }
        }

    }
}

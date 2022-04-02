import java.util.Scanner;

public class Ch6_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("두 정수 입력: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.print("나눗셈 결과값: " + Divide(num1, num2));
    }

    static int Divide(int num1, int num2)
    {
        int cnt = 0;
        while (num1 >= num2)
        {
            num1 -= num2;
            cnt++;
        }
        return cnt;
    }
}

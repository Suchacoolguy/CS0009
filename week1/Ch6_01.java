import java.util.Scanner;

public class Ch6_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, res;

        System.out.print("두 정수 입력: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        res = Sum(num1, num2);

        System.out.print("두 정수의 합: " + res);

    }

    static int Sum(int x, int y)
    {
        return (x + y);
    }
}

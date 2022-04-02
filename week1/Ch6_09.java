import java.util.Scanner;

public class Ch6_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, res;

        System.out.print("정수 입력: ");
        num = scanner.nextInt();

        res = Fibonacci(num);
        if (res == -1)
            System.out.print("잘못된 입력입니다.");
        else
            System.out.print("n번째  피보나치 수열 값은: " + res);
    }
    static int Fibonacci (int num)
    {
        if (num <= 0)
            return -1;          // 에러 표시
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;

        return (Fibonacci(num - 1) + Fibonacci(num - 2));

    }
}

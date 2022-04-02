import java.util.Scanner;

public class Ch6_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("정수 입력: ");
        num = scanner.nextInt();

        System.out.println("Factorial 결과값: " + Factorial(num));

    }

    static int Factorial (int num)
    {
        if (num == 1)
            return 1;
        return (num * Factorial(num - 1));
    }
}

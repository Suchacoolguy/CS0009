import java.util.Scanner;

public class Ch4_03 {
    public static void main(String[] args) {
        System.out.print("Input number? ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 0)               // 구현조건1, 중복 if를 사용해 구현
        {
            if (num % 2 == 1)
            {
                System.out.printf("%d is Odd and Positive number", num);
            }
            else
            {
                System.out.printf("%d is Even and Positive number", num);
            }
        }
        if (num < 0 && num % 2 == -1)       // 구현조건2, 논리 연산자를 사용해 구현
        {
            System.out.printf("%d is Odd and Negative number", num);
        }
        if (num < 0 && num % 2 == 0)
        {
            System.out.printf("%d is Even and Negative number", num);
        }

    }
}

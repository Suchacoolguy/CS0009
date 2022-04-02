import java.util.Scanner;

public class Ch5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, res;

        System.out.print("Input number? ");
        num = scanner.nextInt();

        System.out.printf("%d! = ", num);
        res = 1;
        for (int i = num; i > 1; i--)
        {
            res *= i;
            System.out.print(i + " * ");
        }
        System.out.printf("1 = %d", res);
    }
}

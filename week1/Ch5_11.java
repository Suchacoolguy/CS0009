import java.util.Scanner;

public class Ch5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum, temp;

        System.out.print("Input number 1 ? ");
        num1 = scanner.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = scanner.nextInt();

        if (num1 > num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("Odd Number : ");
        sum = 0;
        for (int i = num1; i <= num2; i++)
        {
            if (i % 2 == 1)
            {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.print("\nOdd Sum from min odd to max odd : " + sum);
    }
}

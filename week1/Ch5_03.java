import java.util.Scanner;

public class Ch5_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        System.out.print("Input number1 ? ");
        int num1 = scanner.nextInt();
        System.out.print("Input number2 ? ");
        int num2 = scanner.nextInt();


        for (int i = 0; i < num2; i++) {res += num1;}
        System.out.printf("%d * %d = %d", num1, num2, res);
    }
}

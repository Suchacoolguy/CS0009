import java.util.Scanner;

public class Ch5_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, res;

        System.out.print("Input number 1 ? ");
        num1 = scanner.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = scanner.nextInt();

        res = num1;
        while (res >= num2) {res -= num2;}
        System.out.printf("%d %% %d = %d", num1, num2, res);
    }
}

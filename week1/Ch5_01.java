import java.util.Scanner;

public class Ch5_01 {
    public static void main(String[] args) {
        System.out.print("Input number? ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        while (inputNum > 0)
        {
            System.out.printf("%d ", inputNum % 10);
            inputNum /= 10;
        }
    }
}

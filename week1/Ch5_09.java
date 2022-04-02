import java.util.Scanner;

public class Ch5_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;

        System.out.print("Input number? ");
        inputNum = scanner.nextInt();

        for (int i = 0; i < inputNum; i++)
        {
            for (int j = 0; j < inputNum - i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

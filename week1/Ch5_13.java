import java.util.Scanner;

public class Ch5_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum, middle;

        System.out.print("Input number ? ");
        inputNum = scanner.nextInt();

        middle = inputNum / 2;
        for (int i = 0; i <= middle; i++)
        {
            for (int j = 0; j < middle - i; j++)        // 별 출력 전에 나오는 공백
                System.out.print(" ");
            for (int k = middle - i; k <= middle + i; k++)      // 별 출력
                System.out.print("*");
            System.out.print("\n");                         // 줄 이동
        }                               //여기까지가 윗부분 출력;

        for (int x = middle; x > 0; x--)
        {
            for (int y = middle; y < inputNum - x; y++)
                System.out.print(" ");
            for (int z = 0; z < x + x - 1 ; z++)
                System.out.print("*");
            System.out.print("\n");                         // 줄 이동
        }

    }
}

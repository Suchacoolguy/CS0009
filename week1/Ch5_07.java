import java.util.ArrayList;
import java.util.Scanner;

public class Ch5_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Input number? ");
        num = scanner.nextInt();

        System.out.print("Divisor : ");
        System.out.print("1 ");      // 1은 항상 약수가 됨.
        for (int i = 2; i <= num / 2; i++)   // 자기 자신을 제외한 나머지 약수들은 (num/2)보다 클 수 없으므로 (num/2)까지 반복
        {
            if (num % i == 0) {System.out.printf("%d ", i);}
        }
        System.out.print(num);        // 자기 자신은 항상 약수
    }
}

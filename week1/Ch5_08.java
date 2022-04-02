import java.util.Scanner;

public class Ch5_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum, rem, pow, res;

        System.out.print("Input Binary number? ");
        inputNum = scanner.nextInt();

        pow = 1; res = 0;
        while (inputNum > 0)
        {
            rem = inputNum % 10;            // 마지막 자리의 수를 구해 rem 변수에 대입.
            res += (rem * pow);             // 자릿수에 맞게 2의 제곱승을 곱하고 결과값에 더한다.
            inputNum /= 10;                 // 1의 자리부터 왼쪽으로 한자리씩 옮겨가기 위한 연산.
            pow *= 2;                       // 왼쪽으로 옮길때마다 2의 제곱연산.
        }
        System.out.print("Decimal Number : " + res);
    }
}

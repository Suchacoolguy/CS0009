import java.util.Scanner;

public class Ch6_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;

        while (true)
        {
            System.out.print("정수 입력: ");
            inputNum = scanner.nextInt();

            if (inputNum == -1)
                return;

            IsPrime(inputNum);
        }
    }

    static void IsPrime (int num)
    {
        boolean prime = true;
        for (int i = 2; i <= num / 2; i++)      // 1과 자기자신을 제외하면 약수는 num/2보다 클 수 없음.
        {
            if (num % i == 0)                   // 나누어 떨어지는 i가 존재하는가?
                prime = false;                  // 존재한다면 소수가 아님.
            else
                continue;
        }

        if (prime == true && (num > 1))             // 소수의 정의: 소수는 1보다 큰 수이다.
            System.out.println("정수 " + num + "은 소수입니다.");
        else
            System.out.println("정수 " + num + "은 소수가 아닙니다.");
    }
}

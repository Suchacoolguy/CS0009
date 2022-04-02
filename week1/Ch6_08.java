import java.util.Scanner;

public class Ch6_08 {      // 예제가 잘못된 듯, 1은 소수가 아님.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = scanner.nextInt();


        PrimeCount(num);
    }
    static void PrimeCount (int num)
    {
        int count, sum;
        boolean isPrime = true; count = 0; sum = 0;

        for (int i = 2; i <= num; i++)
        {
            if (IsPrime(i))
            {
                count++;
                sum += i;
            }
        }
        System.out.printf("정수 %d까지 소수는 %d개, 합은 %d입니다.", num, count, sum);
    }
    static boolean IsPrime (int num)
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
            return true;
        else
            return false;
    }
}

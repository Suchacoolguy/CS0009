import java.util.Scanner;

public class Ch5_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum, max, min, sum, cnt;
        double avg;

        sum = 0; cnt = 0; avg = 0; max = Integer.MIN_VALUE; min = Integer.MAX_VALUE;  // 가장 작은 값과 큰 값으로 초기화
        while(true)
        {
            System.out.print("Input number? ");
            inputNum = scanner.nextInt();

            if (inputNum == -1)
            {
                System.out.println("최소값 : " + min);
                System.out.println("최대값 : " + max);
                System.out.println("평균값 : " + avg);
                break;
            }
            else if (inputNum < 0)          // 0 이상의 수만 입력 받는다.
            {
                System.out.println("Positive number only.");
                return;
            }

            if (inputNum > max) {max = inputNum;}          // 최대값
            if (inputNum < min) {min = inputNum;}           // 최소값
            cnt++;
            sum += inputNum;
            avg = (double) sum / cnt;                       // 평균값
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class Ch6_05 {
    public static void main(String[] args) {


        System.out.println("내가 선택한 숫자를 맞추어 보세요 (0-99)");
        Quiz();
    }
    static void Quiz()
    {
        Scanner scanner = new Scanner(System.in);
        int answer, inputNum;
        Random random = new Random();
        answer = random.nextInt(99);

        while (true)
        {
            System.out.print("정수 입력: ");
            inputNum = scanner.nextInt();
            if (inputNum > answer)
                System.out.println("내가 선택한 숫자보다 높습니다.");
            else if (inputNum < answer)
                System.out.println("내가 선택한 숫자보다 낮습니다.");
            else
            {
                System.out.println("내가 선택한 숫자를 정확히 맞혔습니다.");
                return;
            }
        }
    }
}

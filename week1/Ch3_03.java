import java.util.Scanner;

public class Ch3_03 {
    public static void main(String[] args) {
        int number;
        System.out.println("정수 입력: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if ((number < 0) || (number > 25))              // 예외처리
        {
            System.out.println("invalid number");
        }
        else
        {
            System.out.printf("%c", number + 97);        // 형 변환
        }

    }
}

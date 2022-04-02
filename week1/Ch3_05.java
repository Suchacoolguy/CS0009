import java.util.Scanner;

public class Ch3_05 {
    public static void main(String[] args) {
        int hour, minute, second, givenSecond;
        System.out.println("초 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        givenSecond = scanner.nextInt();

        second = givenSecond % 60;
        hour = givenSecond /60 /60;
        minute = givenSecond / 60 % 60;

        System.out.printf("%d시간 %d분 %d초", hour, minute, second);
    }
}

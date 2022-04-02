import java.util.Scanner;

public class Ch6_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        AbsVal(scanner.nextInt());
    }

    static void AbsVal(int num)
    {
        if (num < 0)
            System.out.printf("숫자 %d의 절대값은 %d입니다.", num, -num);
        else
            System.out.printf("숫자 %d의 절대값은 %d입니다.", num, num);
    }
}

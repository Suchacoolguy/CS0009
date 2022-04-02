import java.util.Scanner;

public class Ch3_01 {
    public static void main(String[] args) {
        int first, second;
        System.out.println("first: ");
        Scanner scan = new Scanner(System.in);
        first = scan.nextInt();

        System.out.println("second: ");
        second = scan.nextInt();

        if (second == 0)
        {
            System.out.println("divisor can not be zero");
            return;
        }

        System.out.printf("%d + %d = %d\n", first, second, first + second);
        System.out.printf("%d - %d = %d\n", first, second, first - second);
        System.out.printf("%d * %d = %d\n", first, second, first * second);
        System.out.printf("%d / %d = %.1f\n", first, second, (double)first / second);
        System.out.printf("%d %% %d = %d\n", first, second, first % second);


    }
}

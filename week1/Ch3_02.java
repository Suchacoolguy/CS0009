import java.util.Scanner;

public class Ch3_02 {
    public static void main(String[] args) {
        double res;
        int a, b, c, x;
        System.out.println("2차 다항식 y = a*x^2 + b*x + c");
        System.out.print("계수 및 x 입력 (a, b, c, x): ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        x = scan.nextInt();
        res = a * x * x + b * x + c;
        System.out.printf("계산 결과 y = %.1f", res);
    }
}

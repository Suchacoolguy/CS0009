import java.util.Scanner;

public class Ch3_04 {
    public static void main(String[] args) {
        double weight, height;
        System.out.println("몸무게 입력 :");
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextDouble();
        System.out.println("키 입력 :");
        scanner = new Scanner(System.in);
        height = scanner.nextDouble();
        System.out.printf("비만도: %.3f", (height - 110) / weight);  // 소수점 아래 세자리까지 표현.)
    }
}

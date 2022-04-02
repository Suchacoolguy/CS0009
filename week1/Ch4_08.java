import java.util.Scanner;

public class Ch4_08 {
    public static void main(String[] args) {
        System.out.print("도형 선택 (R: 사각형, T: 삼각형, C: 원)? ");
        Scanner scanner = new Scanner(System.in);
        char shape = scanner.next().charAt(0);
        double width, height, r;

        switch (shape)
        {
            case 'R':
                System.out.print("너비 및 높이 입력? ");
                width = scanner.nextDouble();
                height = scanner.nextDouble();

                System.out.println("사각형 크기 = " + (width * height));
                break;
            case 'T':
                System.out.print("너비 및 높이 입력? ");
                width = scanner.nextDouble();
                height = scanner.nextDouble();

                System.out.println("삼각형 크기 = " + (width * height / 2));
                break;
            case 'C':
                System.out.print("반지름 입력? ");
                r = scanner.nextDouble();

                System.out.println("원 크기 = " + (3.14 * r * r));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

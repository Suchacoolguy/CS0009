import java.util.Scanner;

public class Ch4_07_switch {
    public static void main(String[] args) {
        System.out.print("Input score? ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();        // 실수가 입력되었을 때 오류가 나지 않게 하기 위함.
        int intScore = (int)score;         //int 끼리의 연산에서 소수점 이하를 버리는 특성 활용하기 위해 형변환.

        switch (intScore / 10)
        {
            case 10:
            case 9:
                System.out.println("Grade = A");
                break;
            case 8:
                System.out.println("Grade = B");
                break;
            case 7:
                System.out.println("Grade = C");
                break;
            case 6:
                System.out.println("Grade = D");
                break;
            default:
                System.out.println("Grade = F");
                break;
        }

    }
}

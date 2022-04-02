public class Ch5_15 {
    public static void main(String[] args) {
        for (int num2 = 1; num2 <= 9; num2++)         // 행 반복. 1행부터 9행까지 num2 값이 1씩 증가
        {
            for (int num1 = 2; num1 <= 9; num1++)       // 열 반복. 2단부터 9단까지 1씩 증가
            {
                System.out.format("%d * %d = %2d", num1, num2, num1 * num2);     // 두 자리 수 정렬
                System.out.print("\t");                                         // 공백 제어문자
            }
            System.out.println();                                       // 줄바꿈
        }
    }
}

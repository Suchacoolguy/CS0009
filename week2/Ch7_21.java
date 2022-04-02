import java.util.Scanner;

public class Ch7_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 5 digits number > ");
        String num = sc.nextLine();
        System.out.print(num);
        barcodeGen(num);
        sc.close();
    }

    static void barcodeGen(String num)
    {
        int sum = 0;
        int[] intArr = new int[num.length() + 1];
        int[][] barNum = {{1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 0, 1, 1, 0}, {0, 1, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 0}, {1, 0, 0, 0, 1}, {1, 0, 0, 1, 0}, {1, 0, 1, 0, 0}};
        System.out.print("\n");

        for (int i = 0; i < num.length(); i++)
        {
            intArr[i] = num.charAt(i) - '0';        // int array에 각 자리 숫자 저장
            sum += num.charAt(i) - '0';             // check Digit를 구하기 위해 더함.
        }
        intArr[num.length()] = sum % 10;   // Check Digit 추가

        for (int i = 0; i < 2; i++)         // 1, 2번째 줄
        {
            for (int digit : intArr)        // intArr에서 수 하나씩 꺼냄.
            {
                for (int bar = 0; bar < barNum[digit].length; bar++)   // 숫자 하나당 Bar는 5개
                {
                    if (barNum[digit][bar] == 1)  // int Arr에 저장된 각 자릿수(digit)와 대응하는 Bar Number가 1인가?
                        System.out.print("|");      // 1이면 Bar 출력
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 2; i++)    // 3, 4번째 줄
        {
            for (int bar = 0; bar < barNum[i].length; bar++)
            {
                for (int digits = 0; digits < num.length() + 1; digits++)   // digit 개수 + check digit 수만큼
                    System.out.print("|");                                  // 3, 4번째 줄은 항상 bar 출력
            }
            System.out.print("\n");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Ch6_10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int len, num;

        System.out.print("정렬할 데이터 개수 (최대 10개): ");
        len = scanner.nextInt();

        for (int i = 0; i < len; i++)
            arr[i] = scanner.nextInt();

        AscendingOrder(arr, len);
    }

    static void AscendingOrder (int[] arr, int size)
    {
        int temp;
        for (int stdNum = 0; stdNum < size - 1; stdNum++)
        {
            for (int cprNum = stdNum + 1; cprNum < size; cprNum++)
            {
                if (arr[stdNum] > arr[cprNum])
                {
                    temp = arr[stdNum];
                    arr[stdNum] = arr[cprNum];
                    arr[cprNum] = temp;
                }
            }
        }
        System.out.println("오름차순 정렬 결과");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);
    }
}

import java.util.Scanner;

public class Ch7_04 {
    public static void main(String args[]) {
        int counter, i;
        int number[] = new int[100];

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integer elements(max 100)?");
        counter = scanner.nextInt();

        for (i = 0; i < counter; i++) {
            System.out.print("Enter Array Element" + (i + 1) + ": ");
            number[i] = scanner.nextInt();
        }

        number=reverse(number, counter);

        System.out.print("Reversed array: ");
        for (i = 0; i < counter; i++) {
            System.out.print(number[i] + "  ");
        }
        scanner.close();
    }

    static int[] reverse (int[] arr, int cnt)
    {
        int resArr[] = new int[cnt];
        for (int i = cnt - 1, resIndex = 0; i >= 0; i--, resIndex++)
            resArr[resIndex] = arr[i];
        return resArr;
    }
}

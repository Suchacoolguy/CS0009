import java.util.Scanner;

public class Ch5_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean mlt;

        System.out.print("Input number 1 ? ");
        num1 = scanner.nextInt();
        System.out.print("Input number 2 ? ");
        num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++)
        {
            if (i % 3 == 0) {mlt = true;}
            else if (i % 5 == 0) {mlt = true;}
            else {mlt = false;}

            if (mlt == true)
                System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Ch5_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number 1 ? ");
        int num1 = scanner.nextInt();
        System.out.print("Input number 2 ? ");
        int num2 = scanner.nextInt();
        int sum = 0;

        if (num1 > num2)        //swap
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {sum += i;}
        System.out.println("작은 수부터 큰 수까지의 합 : " + sum);

    }
}

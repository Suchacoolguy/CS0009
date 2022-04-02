import java.util.Scanner;

public class Ch4_02 {
    public static void main(String[] args) {
        System.out.print("Input number? ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {System.out.printf("%d is Even number", num);}
        else if (num % 2 == 1 || num % 2 == -1)       // 음수인 케이스도 고려?
        {System.out.printf("%d is Odd number", num);}
        else {System.out.println("Error: Invalid number");}
    }
}

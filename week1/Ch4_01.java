import java.util.Scanner;

public class Ch4_01 {
    public static void main(String[] args) {
        int first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1 ? ");
        first = scanner.nextInt();
        System.out.print("Input number 2 ? ");
        second = scanner.nextInt();

        if (first > second) {System.out.printf("%d is bigger than %d", first, second);}
        else if (first < second) {System.out.printf("%d is less than %d", first, second);}
        else {System.out.printf("%d is equal to %d", first, second);}
    }
}

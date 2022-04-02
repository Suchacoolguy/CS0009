import java.util.Scanner;

public class Ch5_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        while (true)
        {
            System.out.print("Input Shape Size : ");
            size = scanner.nextInt();
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    if (j == 0 || j == size - 1)
                        System.out.print("*");
                    else if (i == 0 || i == size - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.print("\n");
            }
            if (size == -1)
                return;
        }
    }
}

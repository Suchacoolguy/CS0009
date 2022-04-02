import java.util.Scanner;

public class Ch6_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, y1, y2;

        System.out.print("첫 번째 좌표(X, Y) 입력: ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.print("두 번째 좌표(X, Y) 입력: ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.print("두 좌표 거리: " + Distance(x1, y1, x2, y2));
    }

    static double Distance (int x1, int y1, int x2, int y2)
    {
        double res;
        int xDist, yDist;
        xDist = x2 - x1; yDist = y2 - y1;
        res = Math.sqrt(xDist * xDist + yDist * yDist);

        return res;
    }
}

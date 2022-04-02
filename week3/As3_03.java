import java.util.Scanner;

public class As3_03 {

    static int getMax(int[] arr)
    {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > Max)
                Max = arr[i];
        }
        return Max;
    }

    static int getMin(int[] arr)
    {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < Min)
                Min = arr[i];
        }
        return Min;
    }

    static int getSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    static double getAvg(int[] arr)
    {
        return (double)getSum(arr) / arr.length;
    }

    static int higherThanAvg(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > getAvg(arr))
                count += 1;
        }
        return count;
    }

    static int lowerThanAvg (int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < getAvg(arr))
                count += 1;
        }
        return count;
    }

    static int[] numByScope(int[] arr)
    {
        int[] scores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int scope;

        for (int i = 0; i < arr.length; i++)
        {
            scope = arr[i] / 10;
            if (scope == 10)
                scores[9] += 1;
            else
                scores[scope] += 1;

        }
        return scores;
    }

    static void printScope(int[] arr)
    {
        int idx = 0;
        for (int i = 0; i < 90; i = i + 10)
        {
            System.out.printf("%d - %d 인원수: %d\n", i, i + 9, arr[idx]);
            idx++;
        }
        System.out.printf("%d - %d 인원수: %d\n", 90, 100, arr[idx]);
    }

    static int[] sorting(int[] arr)     //선택정렬
    {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] scores = new int[count];

        for (int i = 0; i < count; i++)
        {
            scores[i] = sc.nextInt();
        }

        scores = sorting(scores);

        System.out.println("최고점: " + getMax(scores));
        System.out.println("최하점: " + getMin(scores));
        System.out.println("평균: " + getAvg(scores));
        System.out.println("평균보다 높은 학생 수: " + higherThanAvg(scores));
        System.out.println("평균보다 낮은 학생 수: " + lowerThanAvg(scores));

        printScope(numByScope(scores));
    }
}
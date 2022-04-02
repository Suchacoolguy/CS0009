public class Ch7_23 {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 1, 3, 5};

        selectionSort(intArr);

    }

    public static void selectionSort(int[] a)
    {
        int minIndex;
        int temp;

        for (int i = 0; i < a.length - 1; i++)
        {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            if (i != minIndex)
            {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }

        }

        for (int num : a)
            System.out.println(num);
    }
}

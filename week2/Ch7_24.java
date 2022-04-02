public class Ch7_24 {
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 1, 8, 7, 2, 4};

        insertionSort(a);
        for (int elem : a)
            System.out.printf("%3d", elem);
    }

    public static void insertionSort(int[] a)
    {
        int target; int prev;
        for (int cur = 1; cur < a.length; cur++)
        {
            target = a[cur];
            for (prev = cur - 1; prev >= 0 && a[prev] > target; prev--)
                a[prev + 1] = a[prev];
            a[prev + 1] = target;

        }
    }
}

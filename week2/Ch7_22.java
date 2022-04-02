public class Ch7_22 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print(binarySearch(intArr, 0));
    }

    public static int binarySearch(int[] arr, int key)
    {
        int start = 0; int end = arr.length - 1; int mid;

        while(start <= end)
        {
            mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}

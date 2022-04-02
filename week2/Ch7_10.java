public class Ch7_10 {
    public static void main(String[] args) {
            int[] a1 = { 1, 1, 2, 2, 1 };
            int[] a2 = { 1, 1, 2, 2, 2, 1 };
            int[] a3 = { 1, 1, 1, 2, 2, 2, 1 };
            System.out.println(noTriples(a1));
            System.out.println(noTriples(a2));
            System.out.println(noTriples(a3));
        }
        static boolean noTriples(int[] arr)
        {
            for (int i = 0; i < arr.length - 2; i++)
            {
                if ((arr[i] == arr[i + 1]) && (arr[i + 1] == arr[i + 2]))
                    return false;
            }
            return true;
        }
}

import java.util.Arrays;

public class Ch7_06 {
    public static void main(String[] args) {
            int[] my_array = { 11, 22, 33, 44, 55 };
            int Index_position = 2;
            int newValue = 99;
            System.out.println("Original Array : " + Arrays.toString(my_array));

            insertArray(my_array, Index_position);
            my_array[Index_position] = newValue;
            System.out.println("      New Array: " + Arrays.toString(my_array));
    }
    static void insertArray(int[] arr, int index)           // 다른 객체가 아닌가?
    {
        for (int lastIndex = arr.length - 1; lastIndex > index; lastIndex--)
            arr[lastIndex] = arr[lastIndex - 1];
    }
}

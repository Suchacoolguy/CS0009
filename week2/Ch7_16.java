import java.util.Arrays;

public class Ch7_16 {
    public static void main(String[] args) {
        String str = "Hello this is Java World";
        System.out.println("String is : " + str);
        count(str);
    }

    static void count (String str)
    {
        String[] array = str.split(" ");

        int i = 1;
        for (String myStr : array)
        {
            System.out.println(i + " : " + myStr + " : " + myStr.length());
            i++;
        }
    }
}

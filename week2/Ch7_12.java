public class Ch7_12 {
    public static void main(String[] args) {
            System.out.println(sTimes("Hi", 3));
            System.out.println(sTimes("Hello", 2));
            System.out.println(sTimes("My Java", 2));
    }
    static String sTimes(String str, int times)
    {
        String res = "";
        for (int i = 0; i < times; i++)
            res = res + str;
        return res;
    }
}

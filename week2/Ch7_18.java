public class Ch7_18 {
    public static void main(String[] args) {
        String str = "00100234000";
        System.out.println("String    = " + str);
        str = removeFrontZ(str);
        System.out.println("Converted = " + str);
    }

    static String removeFrontZ (String str)
    {
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        int endPoint = 0;
        while (sb.charAt(endPoint) == '0')
            endPoint++;

        sb.delete(0, endPoint);
        String res = sb.toString();

        return res;
    }
}

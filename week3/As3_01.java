import java.io.*;
import java.util.Scanner;

public class As3_01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/suchacoolguy/IdeaProjects/Assignment2/src/myFile.txt");
        String data = "8.5 inch\n32,767 tables\nmore 3.14159\n1,000,000.1";
        fw.write(data);

        fw.close();

        double sum = 0;
        Scanner sc = new Scanner(new BufferedReader(new FileReader("myFile.txt")));

        while(sc.hasNext())
        {
            if (sc.hasNextDouble())
                sum += sc.nextDouble();
            else
                sc.next();
        }

        System.out.println(sum);

    }
}

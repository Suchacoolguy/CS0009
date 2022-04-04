import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class As4_01 {
    public static void main(String[] args) throws IOException {
        File source = new File(args[0]);
        File dest = new File(args[1]);
        Scanner sc = new Scanner(System.in);


        if (!source.exists())
        {
            System.out.println(source + "not found.");
            return;
        }
        
        if (source.exists() && dest.exists())
        {
                System.out.print("Overwrite?(y/n) : ");
                char yesOrNo = sc.next().charAt(0);
                if (yesOrNo == 'y')
                {
                    Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println(source + " is copied to " + dest + " (overwriting)");
                }
                else
                {
                    System.out.println("0 file(s) copied.");
                }
                

        }
        else
        {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println(source + " is copied to " + dest);
        }
        
    }
}

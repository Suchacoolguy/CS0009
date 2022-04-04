import java.io.File;

public class Asgmt4_02 {
    public static void main(String[] args) {
        File target = new File(args[0]);

        if (target.isDirectory())
        {
            deleteSubfiles(target);
            target.delete();
            System.out.println("Directory " + target + " is deleted.");
            return;
        }

        if (target.exists() && target.canWrite())
        {
            target.delete();
            System.out.println(args[0] + " is deleted.");
        }
        else if (!target.canWrite())
        {
            target.setWritable(true);
            target.delete();
            System.out.println(target + " is deleted.");
        }
        else 
        {
            System.out.println(target + " does not exist.");
        }
    }

    public static void deleteSubfiles(File file)
    {
        for (File subfile : file.listFiles()) {

            if (subfile.isDirectory())
                deleteSubfiles(subfile);
  
            subfile.delete();
        }
    }
}

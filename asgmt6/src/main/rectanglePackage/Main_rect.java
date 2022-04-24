
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

// import asgmt6.Account;

public class Main_rect implements Serializable {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("rectInfo.txt"));
        sc.useDelimiter(":");
        
        Scanner record;
        int cnt = -1;

        int[][] params = new int[5][4]; int i = 0; 
        while (sc.hasNext())
        {
            record = new Scanner(sc.next());
            int j = 0;
            while (record.hasNext())
            {
                params[i][j] = record.nextInt();
                j++;
            }
            cnt++;
            i++;
        }
        
        Rectangle[] rects = new Rectangle[cnt];
        for (int k = 0; k < cnt; k++)
        {
            rects[k] = new Rectangle(params[k][0], params[k][1], params[k][2], params[k][3]);
            makeObjFile(rects[k]);
        }
        
        Arrays.sort(rects, new CompareByArea());

        System.out.println("Area: ");
        for (Rectangle rect : rects)
        {
            System.out.println(rect.getArea());
        }

        System.out.println("Intersection: ");
        for (Rectangle rect : rects)
        {
            System.out.println(rect.getIntersect(rects[1]));
        }

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("rects")))))
        {
            
        }
    }       // end of main
    


    static void makeObjFile(Object rect)
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("rects")))))
        {
            out.writeObject(rect);
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    
    
}

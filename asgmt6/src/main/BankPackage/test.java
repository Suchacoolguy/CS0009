package src.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeMap;

public class test implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

        TreeMap<Integer, Account> map = new TreeMap<Integer, Account>();

        Scanner sc = new Scanner(new File("accInfo.txt"));
        sc.useDelimiter(":");
        Scanner record;

        while (sc.hasNext())
        {
            record = new Scanner(sc.next());
            while (record.hasNext())
            {
                int accNum = record.nextInt();
                int balance = record.nextInt();
                map.put(accNum, new Account(accNum, balance));
            }
        }
        
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("accounts")))))
        {
            out.writeObject(map);
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("accounts")))))
        {
            TreeMap<Integer, Account> a = (TreeMap) in.readObject();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        /

    public static void writeToFile(Account A) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("accInfo.txt"));

        out.writeObject(A);
    }

    public static void readFile() throws IOException, ClassNotFoundException
    {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("accInfo.txt"));

         Account acc = (Account) in.readObject();
         System.out.println(acc);
    }
        // System.out.println(map.get(1));    
}
}


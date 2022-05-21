import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Customer implements Serializable 
{
    int custID;
    String name;
    int balance;

    Customer(int custID, String name, int balance)
    {
        this.custID = custID;
        this.name = name;
        this.balance = balance;
    }
    
    public String toString()
    {
        return custID + " " + name + " " + balance;
    }
}

class CustomerDemo
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        File file = new File("customer.txt");
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator iterator = null;

        if (file.isFile())
        {
            ois = new ObjectInputStream(new FileInputStream(file));
            customers = (ArrayList<Customer>) ois.readObject();
            ois.close();
        }

        
        do
        {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("6. SORT");
            System.out.println("0. EXIT");
            System.out.print("\tChoice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Customer ID: ");
                    int custID = sc.nextInt();

                    System.out.println("Enter Customer Name: ");
                    String name = sc.next();

                    System.out.println("Enter balance: ");
                    int balance = sc.nextInt();

                    customers.add(new Customer(custID, name, balance));
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(customers);
                    oos.close();

                    break;
                case 2:
                    if (file.isFile()) 
                    {

                        ois = new ObjectInputStream(new FileInputStream(file));
                        customers = (ArrayList<Customer>) ois.readObject();
                        ois.close();

                        System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                        iterator = customers.listIterator();
                        while(iterator.hasNext())
                        {
                            System.out.println(iterator.next());
                        }
                        System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                    }
                    else
                    {
                        System.out.println("File not Exists...");
                    }
                    break;
                case 3:
                    if (file.isFile()) 
                    {

                        ois = new ObjectInputStream(new FileInputStream(file));
                        customers = (ArrayList<Customer>) ois.readObject();
                        ois.close();

                        Boolean found = false;
                        System.out.println("Enter cust ID to Search: ");
                        int searchingID = sc.nextInt();
                        System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                        iterator = customers.listIterator();
                        while(iterator.hasNext())
                        {
                            Customer cust = (Customer) iterator.next();
                            if (cust.custID == searchingID)
                            {
                                System.out.println(cust);
                                found = true;
                            }
                        }
                        if (!found)
                            System.out.println("Record Not Found.");
                        System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                    }
                    else
                    {
                        System.out.println("File not Exists...");
                    }
                    break;
                case 4: 
                    if (file.isFile()) 
                        {

                            ois = new ObjectInputStream(new FileInputStream(file));
                            customers = (ArrayList<Customer>) ois.readObject();
                            ois.close();

                            Boolean found = false;
                            System.out.println("Enter cust ID to DELETE: ");
                            int searchingID = sc.nextInt();
                            System.out.println("- - - - - - - - - - - - - -- - - - - - - - - - - - - - - - - - -");
                            iterator = customers.listIterator();
                            while(iterator.hasNext())
                            {
                                Customer cust = (Customer) iterator.next();
                                if (cust.custID == searchingID)
                                {
                                    iterator.remove();
                                    found = true;
                                }
                            }
                            if (found)
                            {
                                oos = new ObjectOutputStream(new FileOutputStream(file));
                                oos.writeObject(customers);
                                oos.close();
                                System.out.println("Record Deleted Successfully!");
                            }
                            else
                            {
                                System.out.println("Record Not Found.");   
                            }
                            System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                        }
                        else
                        {
                            System.out.println("File not Exists...");
                        }
                        break;
                case 5:
                    if (file.isFile()) 
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        customers = (ArrayList<Customer>) ois.readObject();
                        ois.close();

                        Boolean found = false;
                        System.out.println("Enter cust ID to Update: ");
                        int searchingID = sc.nextInt();
                        System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                        iterator = customers.listIterator();
                        while(iterator.hasNext())
                        {
                            Customer cust = (Customer) iterator.next();
                            if (cust.custID == searchingID)
                            {
                                System.out.println("Enter New Balance");
                                int newBalance = sc.nextInt();

                                iterator.set(new Customer(cust.custID, cust.name, newBalance));
                                found = true;
                            }
                        }
                        if (found)
                        {
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(customers);
                            oos.close();
                            System.out.println("Record Updated Successfully!");
                        }
                        else
                        {
                            System.out.println("Record Not Found.");   
                        }
                        System.out.println("- - - - - -- - - - - - - -- - - - - - - - - - - - - - - - - - -");
                    }
                    else
                    {
                        System.out.println("File not Exists...");
                    }
                    break;
                case 6:
                    if (file.isFile()) 
                        {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            customers = (ArrayList<Customer>) ois.readObject();
                            ois.close();

                            Collections.sort(customers, new Comparator<Customer>() {
                                public int compare(Customer c1, Customer c2)
                                {
                                    return (c1.custID - c2.custID);
                                }
                            });

                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(customers);
                            oos.close();
                        }
                        else
                        {
                            System.out.println("File not Exists...");
                        }
                case 0:
            }
        }while(choice != 0);
    }
}

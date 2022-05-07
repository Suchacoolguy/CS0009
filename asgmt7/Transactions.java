import java.util.TreeSet;

public class Transactions {
    TreeSet<Record> transactions = new TreeSet<>(new RecordComparator());

    public void add(Record rec)
    {
        transactions.add(rec);
    }

    public void show()
    {
        for (Record rec : transactions)
        {
            System.out.println(rec.toString());
        }
    }
    
}

import java.util.Date;
public class Record {
    String type;
    Date date;
    int amount;

    public Record(String type, Date today, int amount)
    {
        this.type = type;
        this.date = today;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }
    @Override
    public String toString()
    {
        return "[type: " + type + "\tdate: " + date + "\t금액: " + amount + "]";
    }

    }
    

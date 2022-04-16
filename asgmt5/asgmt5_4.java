import java.util.Scanner;

public class asgmt5_4 {
    public static void main(String[] args) {
        Time time = new Time();
        time.setTime();
        time.printFormatted();    
    }
    
}

class Time{
    private int year;
    private int month;
    private int date;
    private int hour;
    private int minute;
    private int second;

    public void setTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        this.year = sc.nextInt();
        System.out.println("Enter month: ");
        this.month = sc.nextInt();
        System.out.println("Enter date: ");
        this.date = sc.nextInt();
        System.out.println("Enter hour: ");
        this.hour = sc.nextInt();
        System.out.println("Enter minute: ");
        this.minute = sc.nextInt();
        System.out.println("Enter second: ");
        this.second = sc.nextInt();
    }

    public void printFormatted() {
        
        System.out.println("Time: ");
        System.out.printf("%04d-%02d-%02d\n%02d:%02d:%02d",year, month, date, hour, minute, second);
    }
}


import java.util.Scanner;

public class asgmt5_3 {
    public static void main(String[] args) {
        
        Circle cir = new Circle();
        cir.printCircle();

        Rectangle rec = new Rectangle();
        rec.printRectangle();

        Square sqr = new Square();
        sqr.print();
        
        Bycycle bycycle = new Bycycle();
        bycycle.setInfo("Sangheon", "Blue", 100);
        bycycle.printStatus();
    } 
}

class Circle{
    private double distance;
    private int rad;

    void printCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        this.rad = sc.nextInt();
        System.out.println("Circle:\n");
            // Use for loop for row wise
            for (int row = 0; row <= 2 * rad; row++) {
                // Use for loop for col wise
                for (int col = 0; col <= 2 * rad; col++) {
                    distance = Math.sqrt((row - rad) * (row - rad) + (col - rad) * (col - rad));
    
                    /**
                     * Check whether distance is in the range of (radius - 0.5) and (radius + 0.5)
                     * or not to print *
                     */
                    if (distance > rad - 0.5 && distance < rad + 0.5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    }
                System.out.println();
            }
        }
            
}

class Rectangle{
    private int width;
    private int height;

    void printRectangle() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        this.width = sc.nextInt();
        System.out.println("Enter height: ");
        this.height = sc.nextInt();
        System.out.println("Rectangle:\n");

        for (int i = 0; i < height; i++ ) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1)
                    System.out.print("*");
                else if(j == 0 || j == width - 1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}


class Square{
    private int size;

    void print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        this.size = sc.nextInt();

        System.out.println("Square:\n");
        
        for (int i = 0; i < size; i++ ) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1)
                    System.out.print("*");
                else if(j == 0 || j == size - 1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}

class Bycycle{
    private String owner;
    private String color;
    private int height;

    void setInfo(String owner, String color, int height)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter owner: ");
        this.owner = sc.next();
        System.out.println("Enter color: ");
        this.color = sc.next();
        System.out.println("Enter height: ");
        this.height = sc.nextInt();
    }

    String getOwner() {return this.owner;}
    String getColor() {return this.color;}
    int getHeight() {return this.height;}

    void printStatus()
    {
        System.out.println("- - - - - - - - - - - - BIKE STATUS - - - - - - - - - - - - - - -");
        System.out.println("This is " + owner + "'s bike.");
        System.out.println(color + " colored.");
        System.out.println(height + "cm tall.");
    }
}

class Radio{
    private double frequency;
    private String location;

    public void setFrequency(String location) {
        Scanner sc = new Scanner(System.in);
        location = sc.next();

        switch(location)
        {
            case "대구":
                frequency = 96.5;
                break;
            case "서울":
                frequency = 95.9;
                break;
            case "부산":
                frequency = 106.5;
                break;
            case "광주":
                frequency = 93.9;
                break;
            case "대전":
                frequency = 92.5;
                break;
            default:
                frequency = 95.9;
                break;
        }
    }

    public void printStatus()
    {
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("Frequency: " + frequency);
        System.out.println("location: " + location);
    }
}
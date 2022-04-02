import java.util.Scanner;

public class Ch4_07_if {
    public static void main(String[] args) {
        System.out.print("Input score? ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        if (score >= 90) {System.out.println("Grade = A");}
        else if (score >= 80) {System.out.println("Grade = B");}
        else if (score >= 70) {System.out.println("Grade = C");}
        else if (score >= 60) {System.out.println("Grade = D");}
        else {System.out.println("Grade = F");}
    }
}

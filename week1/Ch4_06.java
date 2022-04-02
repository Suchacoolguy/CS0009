import java.util.Scanner;

public class Ch4_06 {
    public static void main(String[] args) {
        System.out.print("Input character? ");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);


        if ((character >= 65) && (character <= 90))
        {
            System.out.printf("%c는 대문자\n", character);
            System.out.printf("%c의 소문자는 %c", character, character + 32);
        }
        else if ((character >= 97) && (character <= 122))
        {
            System.out.printf("%c는 소문자\n", character);
            System.out.printf("%c의 대문자는 %c", character, character - 32);
        }
        else {System.out.println(character + "는 문자가 아님.");}
    }
}

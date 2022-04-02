import java.util.Scanner;

public class Ch4_05 {
    public static void main(String[] args) {
        System.out.print("Input character? ");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        char character = input;

        if ((character >= 65) && (character <= 90)) {character += 32;}      // 대문자인 경우 소문자로 바꿈.
        if ((character >= 97) && (character <= 122))
        {
            switch (character)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.printf("%c is Vowel", input);
                    break;
                default:
                    System.out.printf("%c is Consonant", input);
                    break;
            }
        }
        else {System.out.println("Invalid input");}
    }
}

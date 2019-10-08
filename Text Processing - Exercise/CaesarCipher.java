package Lecutre8TextProcessing.exersice;

        import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length();i++) {
            char letter = text.charAt(i);
            System.out.print((char)(letter + 3));
        }
    }
}

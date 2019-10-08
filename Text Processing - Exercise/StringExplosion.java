package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder output = new StringBuilder();
    //abv>1>1>2>2asdasd
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            output.append(letter);
            if (letter == '>'){
                i++;
                int power = text.charAt(i) - '0';
                int j = i;
                for (; j < i + power && j < text.length(); j++) {
                    if (text.charAt(j) == '>'){
                        output.append('>');
                        j++;
                        power += (text.charAt(j) - '0') + 1;
                    }
                }
                i = j - 1;
            }
        }
        System.out.println(output);
    }
}

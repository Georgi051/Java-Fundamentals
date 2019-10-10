package OldFinalExamTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] twoWords = scanner.nextLine().split(" ");
        String textWord = twoWords[0];
        String changeWord = twoWords[1];

        String regex = "^([d-z{}|#]*)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String output = "";
        if (matcher.find()) {
            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);
                char newLetter = (char) (letter - 3);
                output += newLetter;
            }
        } else {
            System.out.println("This is not the book you are looking for.");
        }
        if (output.contains(textWord)) {
            output = output.replace(textWord, changeWord);
        }
        System.out.println(output);
    }
}

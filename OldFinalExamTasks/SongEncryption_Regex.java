package OldFinalExamTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption_Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^([A-Z][a-z'\\s]+):([A-Z\\s]+)$";
        Pattern pattern = Pattern.compile(regex);

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            Matcher matcher = pattern.matcher(command);
            StringBuilder data = new StringBuilder();
            if (!matcher.find()) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            } else {
                String artist = matcher.group(1);
                int key = artist.length();
                for (int i = 0; i < command.length(); i++) {
                    char letter = command.charAt(i);
                    if (letter == ' ') {
                        data.append(letter);
                    } else if (letter == '\'') {
                        data.append(letter);
                    } else if (letter == ':') {
                        data.append('@');
                    } else if (Character.isLetter(letter)) {
                        if (Character.isLowerCase(letter)) {
                            int value = letter + key;
                            while (value > 122) {
                                int diff = value - 122;
                                value = diff + 96;
                            }
                            data.append((char) value);
                        } else if (Character.isUpperCase(letter)) {
                            int value = letter + key;
                            while (value > 90) {
                                int diff = value - 90;
                                value = diff + 64;
                            }
                            data.append((char) value);
                        }
                    }
                }
            }
            System.out.printf("Successful encryption: %s\n", data);
            command = scanner.nextLine();
        }
    }
}

package OldFinalExamTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^([A-Z!@#$?a-z0-9]+)=(\\d+)<<(.+)";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!"Last note".equals(input)) {
            String data = input;
            Matcher matcher = pattern.matcher(data);
            boolean isFound = false;
            while (matcher.find()){
                int length = Integer.parseInt(matcher.group(2));
                String name = "";
                if (length == matcher.group(3).length()) {
                    for (int i = 0; i < matcher.group(1).length(); i++) {
                        char letter = matcher.group(1).charAt(i);
                        if (Character.isLetterOrDigit(letter)) {
                            name += letter;
                            isFound = true;
                        }
                    }
                    System.out.printf("Coordinates found! %s -> %s\n", name, matcher.group(3));
                }
            }
            if (!isFound){
                System.out.println("Nothing found!");
            }
            input = scanner.nextLine();
        }
    }
}

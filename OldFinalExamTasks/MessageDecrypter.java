package FinalExam.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String regex = "^([$%])([A-Z][a-z]{2,})\\1: \\[(\\d+)\\]\\|\\[(\\d+)\\]\\|\\[(\\d+)\\]\\|$";

            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String output = "";
                String name = matcher.group(2);
                int one = Integer.parseInt(matcher.group(3));
                int two = Integer.parseInt(matcher.group(4));
                int three = Integer.parseInt(matcher.group(5));

                output += (char)one;
                output += (char)two;
                output += (char)three;
                System.out.printf("%s: %s\n",name, output);
            }else {
                System.out.println("Valid message not found!");
            }
        }

    }
}


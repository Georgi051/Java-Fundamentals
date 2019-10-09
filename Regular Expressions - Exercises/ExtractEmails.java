package Lecture9Regex.exersice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([a-z0-9]+[\\-_\\.]?[a-z0-9]+)@([a-z0-9-.]+[a-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher email = pattern.matcher(input);

        while (email.find()){
            System.out.printf("%s\n",email.group());
        }
    }
}

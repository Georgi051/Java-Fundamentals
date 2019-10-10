package OldFinalExamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("&");

        List<String> output = new ArrayList<>();
        Arrays.stream(input).filter(e -> ((e.length() == 25 || e.length() == 16) &&
                e.matches("[A-Za-z\\d]+"))).forEach(string -> {
            StringBuilder data = new StringBuilder();
            if (string.length() == 16) {
                for (int i = 0; i < string.length(); i++) {
                    if (i != 0 && i % 4 == 0) {
                        data.append('-');
                    }
                    char letter = string.charAt(i);
                    if (Character.isDigit(letter)) {
                        int currDigit = Character.getNumericValue(letter);
                        currDigit = 9 - currDigit;
                        data.append(currDigit);
                    } else {
                        data.append(letter);
                    }
                }
            } else {
                for (int i = 0; i < string.length(); i++) {
                    if (i != 0 && i % 5 == 0) {
                        data.append('-');
                    }
                    char letter = string.charAt(i);
                    if (Character.isDigit(letter)) {
                        int currDigit = Character.getNumericValue(letter);
                        currDigit = 9 - currDigit;
                        data.append(currDigit);
                    } else {
                        data.append(letter);
                    }
                }
            }
            output.add(String.valueOf(data));
        });
        System.out.println(String.join(", ", output).toUpperCase());
    }
}

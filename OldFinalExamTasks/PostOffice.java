package OldFinalExamTasks;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] data = input.split("\\|");

        Pattern wordStartLetter = Pattern.compile("([#$%*&])([A-Z]+)\\1");
        Matcher matcher = wordStartLetter.matcher(data[0]);

        Pattern ascii = Pattern.compile("([\\d+]{1,20}):([\\d+]{2})");
        Matcher matcher1 = ascii.matcher(data[1]);

        Pattern word = Pattern.compile("\\b([A-Z][\\S]{1,20})\\b");
        Matcher matcher2 = word.matcher(data[2]);

        Map<Character, Integer> currentData = new LinkedHashMap<>();
        StringBuilder letters = new StringBuilder();
        if (matcher.find()) {
            String capitalLetters = matcher.group(2);
            letters.append(capitalLetters);
        }

        while (matcher1.find()) {
            int asciiCode = Integer.parseInt(matcher1.group(1));
            int length = Integer.parseInt(matcher1.group(2));

            for (int i = 0; i < letters.length(); i++) {
                if (letters.charAt(i) == (char) asciiCode) {
                    currentData.put(letters.charAt(i), length + 1);
                }
            }
        }
        List<String> output = new ArrayList<>();
        while (matcher2.find()) {
            String findWord = matcher2.group();

            for (Map.Entry<Character, Integer> kpv : currentData.entrySet()) {
                if (findWord.length() == kpv.getValue() && kpv.getKey() == findWord.charAt(0)) {
                    output.add(findWord);
                }
            }
        }

        for (String s : output) {
            System.out.println(s);
        }
    }
}

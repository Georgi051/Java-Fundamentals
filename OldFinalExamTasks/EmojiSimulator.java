package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String[] emodjiCode = scanner.nextLine().split(":");
        int sum = 0;
        int totalPower = 0;

        for (String s : emodjiCode) {
            sum += Integer.parseInt(s);
        }

        String regex = "(?<=\\s)(\\:[a-z]{4,}\\:)(?=\\s|[,.?!])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        List<String> emodjiList = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        while (matcher.find()) {
            int currentSum = 0;
            String emodji = matcher.group();
            for (int i = 0; i < emodji.length(); i++) {
                if (emodji.charAt(i) != ':') {
                    int asciiValue = emodji.charAt(i);
                    currentSum += asciiValue;
                }
            }
            value.add(currentSum);
            totalPower += currentSum;
            emodjiList.add(emodji);
        }

        for (Integer power : value) {
            if (power == sum) {
                totalPower *= 2;
            }
        }

        if (emodjiList.size() > 0) {
            System.out.print("Emojis found: ");
            System.out.println(String.join(", ", emodjiList));
        }
        System.out.printf("Total Emoji Power: %d", totalPower);
    }
}

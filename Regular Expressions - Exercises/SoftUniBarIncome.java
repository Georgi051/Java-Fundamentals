package Lecture9Regex.exersice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        String regex = "%([A-Z][a-z]+)%[^|$%.]*<(\\w+)>[^|$%.]*\\|(\\d+)\\|[^|$%.]*?(\\d+\\.?\\d+)\\$";
        String input = scanner.nextLine();
        while (!"end of shift".equals(input)){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                int count = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));
                double currentSum = count * price;
                System.out.printf("%s: %s - %.2f\n",matcher.group(1),matcher.group(2)
                ,currentSum);
                totalSum += currentSum;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalSum);
    }
}

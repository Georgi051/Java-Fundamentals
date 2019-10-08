package Lecture9Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();

        String regex = "\\b(?<day>\\d{2})([.\\-/])(?<month>[A-Z][a-z]{2})\\2(?<year>[\\d]{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(inputData);

        while (dates.find()){
            String day = dates.group("day");
            String month = dates.group("month");
            String year = dates.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s\n",day,month,year);
        }
    }
}

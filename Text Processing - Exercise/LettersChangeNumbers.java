package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String s : text) {
            char before = s.charAt(0);
            char after = s.charAt(s.length()-1);
            int num = Integer.parseInt(s.substring(1,s.length() - 1));
            sum += currentValue(before,after,num);
        }
        System.out.printf("%.2f",sum);
    }

    private static double currentValue(char before, char after, int num) {
        double value = 0;
        if (Character.isUpperCase(before)){
            value += num * 1.00 / (before - 'A' + 1);
        }else {
            value += num * 1.00 * (before - 'a' + 1);
        }

        if (Character.isUpperCase(after)){
            value -= (after - 'A' + 1);
        }else {
            value += (after - 'a' + 1);
        }

        return value;
    }
}

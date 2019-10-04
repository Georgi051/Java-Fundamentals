package Lecture4Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedResult(input,repeatCount));
    }
    static String repeatedResult (String input ,int repeatCount){
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += input;
        }
        return result;
    }
}

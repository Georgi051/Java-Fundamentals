package Lecture4Methods.exersise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printResult(num);
    }

    static void printResult(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            boolean oddDigit = false;
            int index = i;
            while (true) {
                if (index == 0) {
                    break;
                }
                int right = index % 10;
                sum += right;
                if (right % 2 != 0) {
                    oddDigit = true;
                }
                index /= 10;
            }
            if (sum % 8 == 0 && oddDigit == true) {
                System.out.println(i);
            }
        }
    }
}

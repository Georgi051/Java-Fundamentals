package Lacture2;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
           // int num = input.charAt(i);
           // int nums = Character.getNumericValue(num);
           // sum += nums;
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        System.out.println(sum);
    }
}

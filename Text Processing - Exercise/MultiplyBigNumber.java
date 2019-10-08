package Lecutre8TextProcessing.exersice;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal num = new BigDecimal(scanner.nextLine());
        BigDecimal digit = new BigDecimal(scanner.nextLine());
        BigDecimal result = num.multiply(digit);

        System.out.printf("%.0f",result);
    }
}

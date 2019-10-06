package Lecutre6ObjectAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        System.out.println(fact);
    }
}

package Lecture4Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        double result = calculations(input,pow);
        System.out.println(new DecimalFormat("0.########").format(result));

    }
    static double calculations(double input, int pow){
        double result = 1;
        for (int i = 1; i <= pow; i++) {
                result *= input;
        }
        return result;
    }
}

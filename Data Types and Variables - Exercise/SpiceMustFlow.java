package Lacture2;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int workersCons = 0;
        int dayCount = 0;

        if (startingYield < 100) {
            System.out.println(dayCount);
            System.out.println(workersCons);
        }else {
            while (startingYield >= 100){
                dayCount++;
                workersCons += startingYield - 26;
                startingYield -= 10;
            }
            workersCons -= 26;
            System.out.println(dayCount);
            System.out.println(workersCons);
        }
    }
}

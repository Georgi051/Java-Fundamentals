package Lacture2;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());



        long best = 0;
        int bestSnowBallSnow = 0;
        int snowBallbestTime = 0;
        int snowBallbestQuality = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime  = Integer.parseInt(scanner.nextLine());
            int snowballQuality  = Integer.parseInt(scanner.nextLine());

            long snowballValue = (long)Math.pow((snowballSnow * 1.0 / snowballTime),snowballQuality);
           if (snowballValue > best){
                best = snowballValue;
                bestSnowBallSnow = snowballSnow;
                snowBallbestTime = snowballTime;
                snowBallbestQuality = snowballQuality;
           }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnowBallSnow,snowBallbestTime,best,snowBallbestQuality);
    }
}

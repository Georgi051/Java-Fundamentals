package Lacture3Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < input.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i ;j++) {
                leftSum += input[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < input.length; j++) {
                rightSum += input[j];
            }
            if (leftSum == rightSum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}

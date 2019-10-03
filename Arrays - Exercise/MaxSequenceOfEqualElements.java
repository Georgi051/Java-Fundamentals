package Lacture3Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxSequence = 0;
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            int timeSequence = 0;
            for (int j = i; j < input.length; j++) {
                if (input[i] == input[j]){
                    timeSequence++;
                    if (timeSequence > maxSequence){
                        maxSequence = timeSequence;
                        index = i;
                    }
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxSequence; i++) {
            System.out.print(input[index] + " ");
        }

    }
}

package Lacture3Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < nums.length; i++) {
            boolean isbigger = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    isbigger = false;
                    break;
                }
            }
            if (isbigger) {
                System.out.print(nums[i] + " ");
            }
        }
    }

}

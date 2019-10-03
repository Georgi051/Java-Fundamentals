package Lacture3Arrays.exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] evenNums = new String[input];
        String[] oddNums = new String[input];

        for (int i = 0; i < input; i++) {
            String[] nums = scanner.nextLine().split(" ");

            if (i % 2 == 0){
                evenNums[i] = nums[0];
                oddNums[i] = nums[1];
            }else {
                evenNums[i] = nums[1];
                oddNums[i] = nums[0];
            }
        }
        System.out.println(String.join(" ",evenNums));
        System.out.println(String.join(" ",oddNums));

    }
}

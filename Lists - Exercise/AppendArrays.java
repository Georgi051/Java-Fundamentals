package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|+");

        List<Integer> output = new ArrayList<>();

        for (int i = input.length - 1; i >= 0 ; i--) {
            String[] nums = input[i].split("\\s+");

            for (String num : nums) {
                if (!num.equals("")){
                    output.add(Integer.parseInt(num));
                }
            }
        }
        for (int nums : output) {
            System.out.printf("%d ",nums);
        }
    }
}

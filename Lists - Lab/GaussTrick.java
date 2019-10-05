package Lecutre5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.asList(scanner.nextLine().split(" "));

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            nums.add(Integer.parseInt(input.get(i)));
        }

        int size = nums.size() / 2;
        for (int i = 0; i < size; i++) {
            int firstDigit = nums.get(i);
            int lastDigit = nums.get(nums.size() - 1);
            nums.set(i,firstDigit + lastDigit);
            nums.remove(nums.size() -1);
        }

        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}

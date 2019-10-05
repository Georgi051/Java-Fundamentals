package Lecutre5Lists;


import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                output.add(nums.get(i));
            }
        }
        Collections.reverse(output);
        if (output.size() > 0) {
            for (Integer integer : output) {
                System.out.print(integer + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}

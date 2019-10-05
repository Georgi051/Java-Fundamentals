package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int half = input.size() / 2;

        List<Integer> leftR = new ArrayList<>();
        List<Integer> rightR = new ArrayList<>();
        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < half; i++) {
            leftR.add(input.get(i));
        }
        for (int i = half + 1; i <= input.size() - 1 ; i++) {
            rightR.add(input.get(i));
        }

        for (int i = 0; i < leftR.size(); i++) {
            if (leftR.get(i) == 0){
                leftSum *= 0.8;
            }else {
                leftSum += leftR.get(i);
            }
        }
        for (int i = rightR.size()- 1; i >= 0 ; i--) {
            if (rightR.get(i) == 0){
                rightSum *= 0.8;
            }else {
                rightSum += rightR.get(i);
            }
        }
        if (leftSum < rightSum){
            System.out.printf("The winner is left with total time: %.1f",leftSum);
        }else {
            System.out.printf("The winner is right with total time: %.1f",rightSum);
        }
    }
}

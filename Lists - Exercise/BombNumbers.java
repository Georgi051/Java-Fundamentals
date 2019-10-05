package Lecutre5Lists.exersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceNums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] inputData = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();

        int bombNum = inputData[0];
        int powerBomb = inputData[1];

        while (sequenceNums.contains(bombNum)) {
            int index = sequenceNums.indexOf(bombNum);

            int leftSide = Math.max(0, index - powerBomb);
            int rightSide = Math.min(index + powerBomb, sequenceNums.size() - 1);

            for (int i = rightSide; i >= leftSide; i--) {
                sequenceNums.remove(i);
            }
        }
        int sum = 0;
        for (Integer sequenceNum : sequenceNums) {
            sum += sequenceNum;
        }
        System.out.println(sum);
    }

}


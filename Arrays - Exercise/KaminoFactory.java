package Lacture3Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[] output = new int[length];

        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestIndexRow = 0;
        int bestIndexRowOutput = 0;
        String bestDNAOutput = " ";

        String command = scanner.nextLine();
        while (!"Clone them!".equals(command)) {
            bestIndexRow++;
            int[] inputDNA = Arrays.stream(command.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();
            int maxIndex = 0;
            int maxLenght = 0;
            for (int i = 0; i < inputDNA.length; i++) {
                int timeLenght = 0;
                for (int j = i; j < inputDNA.length; j++) {
                    if (inputDNA[i] == inputDNA[j]) {
                        timeLenght++;
                        if (timeLenght > maxLenght) {
                            maxLenght = timeLenght;
                            maxIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int sequenceSum = 0;
            for (int i = 0; i < inputDNA.length; i++) {
                if (inputDNA[i] == 1) {
                    sequenceSum += inputDNA[i];
                }
            }
            if (maxIndex < bestSequenceIndex || sequenceSum > bestSequenceSum) {
                bestDNAOutput = " ";
                bestSequenceIndex = maxIndex;
                bestSequenceSum = sequenceSum;
                bestIndexRowOutput = bestIndexRow;
                for (int i = 0; i < inputDNA.length; i++) {
                    bestDNAOutput += inputDNA[i];
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestIndexRowOutput, bestSequenceSum);
        String outputDNA = bestDNAOutput.replaceAll("", " ");
        System.out.print(outputDNA.trim());
    }
}

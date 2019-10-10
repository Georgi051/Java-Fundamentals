package ExamsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bestTotalQuality = Double.MIN_VALUE;


        String command = scanner.nextLine();
        String[] outputData = new String[command.length()];
        String[] bestOutput = new String[command.length()];

        while (!"Bake It!".equals(command)) {
            String[] inputData = command.split("#");
            double sum = 0;
            String[] bestData = new String[command.length()];
            for (int i = 0; i < inputData.length; i++) {
                sum += Integer.parseInt(inputData[i]);
                bestData[i] = inputData[i];
            }


            if (sum > bestTotalQuality) {
                bestTotalQuality = sum;
                outputData = bestData;
                bestOutput = outputData;
            } else if (sum == bestTotalQuality ) {
                bestOutput = new String[0];
                if (sum != 0) {
                    if (outputData.length > bestOutput.length) {
                        bestOutput = outputData;
                    }
                }
                command = scanner.nextLine();
            }
            System.out.printf("Best Batch quality: %.0f\n", bestTotalQuality);
            bestOutput = Arrays.stream(bestOutput).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
            System.out.print(String.join(" ", bestOutput));
        }
    }
}

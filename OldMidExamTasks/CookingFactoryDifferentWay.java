package ExamsTasks;


import java.util.*;
import java.util.stream.Collectors;

public class CookingFactoryDifferentWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> output = new ArrayList<>();


        int bestQualitySum = Integer.MIN_VALUE;

        String command = scanner.nextLine();
        while (!"Bake It!".equals(command)){
            int[] input = Arrays.stream(command.split("#+"))
                    .mapToInt(Integer::parseInt).toArray();

            int breadQualitySum = 0;

            for (int i = 0; i < input.length; i++) {
                breadQualitySum += input[i];
            }


            if (breadQualitySum > bestQualitySum){
                bestQualitySum = breadQualitySum;

                output.removeAll(output);

                newDataInList(output, input);
            } else if (breadQualitySum == bestQualitySum){
                if (breadQualitySum != 0){
                    if (breadQualitySum / input.length > bestQualitySum / output.size()){

                        output.removeAll(output);

                        newDataInList(output, input);
                    }
                }else {
                    if (input.length < output.size()){
                        output.removeAll(output);
                        newDataInList(output, input);
                    }

                }

            }
            command = scanner.nextLine();
        }
        System.out.printf("Best Batch quality: %d%n",bestQualitySum);
        for (int bread : output) {
            System.out.print(bread + " ");
        }
    }

    public static void newDataInList(List<Integer> output, int[] input) {
        for (int value : input) {
            output.add(value);
        }
    }
}

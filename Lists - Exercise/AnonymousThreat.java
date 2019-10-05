package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!"3:1".equals(command)) {
            String[] input = command.split("\\s+");
            String typeComand = input[0];

            switch (typeComand) {
                case "merge":
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > data.size() - 1) {
                        endIndex = data.size() - 1;
                    }
                    int count = startIndex;
                    for (int i = startIndex; i < endIndex; i++) {
                        String element = data.get(count);
                        String nextElement = data.get(count + 1);

                        String merge = element.concat(nextElement);
                        data.set(count, merge);
                        data.remove(count + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(input[1]);
                    int partitions = Integer.parseInt(input[2]);

                    if (index >= 0 && index < data.size() && partitions >= 0 && partitions <= 100) {
                        String word = data.get(index);
                        List<String> currList = new ArrayList<>();

                        if (word.length() % partitions == 0) {
                            int wordSplitParts = word.length() / partitions;
                            int couter = 0;
                            for (int i = 0; i < partitions; i++) {
                                String marge = "";
                                for (int j = 0; j < wordSplitParts; j++) {
                                    char symbol = word.charAt(couter);
                                    marge += symbol;
                                    couter++;
                                }
                                currList.add(marge);
                            }
                        } else {
                            int wordSplitParts = word.length() / partitions;
                            int couter = 0;
                            for (int i = 0; i < partitions; i++) {
                                String marge = "";

                                if (i == partitions - 1) {
                                    for (int j = couter; j < word.length(); j++) {
                                        char symbol = word.charAt(couter);
                                        marge += symbol;
                                        couter++;
                                    }
                                } else {
                                    for (int j = 0; j < wordSplitParts; j++) {
                                        char symbol = word.charAt(couter);
                                        marge += symbol;
                                        couter++;
                                    }
                                }
                                currList.add(marge);
                            }
                        }
                        data.remove(index);
                        data.addAll(index, currList);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String output : data) {
            System.out.printf("%s ", output);
        }
    }
}

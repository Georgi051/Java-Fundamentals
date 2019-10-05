package Lecutre5Lists.exersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!(input.size() == 0)) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < input.size()) {
                int currentNum = input.remove(index);
                sum += currentNum;

                for (int i = 0; i < input.size(); i++) {
                    if (currentNum >= input.get(i)) {
                        input.set(i, currentNum + input.get(i));
                    } else {
                        input.set(i, input.get(i) - currentNum);
                    }
                }
            } else if (index < 0) {
                int lastIndex = input.get(input.size() - 1);
                int removed = input.remove(0);
                input.add(0, lastIndex);

                sum += removed;
                for (int i = 0; i < input.size(); i++) {
                    if (removed >= input.get(i)) {
                        input.set(i, removed + input.get(i));
                    } else {
                        input.set(i, input.get(i) - removed);
                    }
                }
            } else if (index > input.size() - 1) {
                int removedIndex = input.remove(input.size() - 1);
                int firstIndex = input.get(0);
                input.add(firstIndex);

                sum += removedIndex;
                for (int i = 0; i < input.size(); i++) {
                    if (removedIndex >= input.get(i)) {
                        input.set(i, removedIndex + input.get(i));
                    } else {
                        input.set(i, input.get(i) - removedIndex);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

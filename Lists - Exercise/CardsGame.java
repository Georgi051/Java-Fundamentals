package Lecutre5Lists.exersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deskOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> deskTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < deskOne.size(); i++) {
            for (int j = 0; j < deskTwo.size(); j++) {

                if (deskTwo.get(j) > deskOne.get(i)) {
                    deskTwo.add(deskTwo.get(j));
                    deskTwo.remove(deskTwo.get(j));
                    deskTwo.add(deskOne.get(i));
                    deskOne.remove(deskOne.get(i));
                    i = -1;
                    break;
                } else if (deskTwo.get(j) < deskOne.get(i)) {
                    deskOne.add(deskOne.get(i));
                    deskOne.remove(deskOne.get(i));
                    deskOne.add(deskTwo.get(j));
                    deskTwo.remove(deskTwo.get(j));
                    i = -1;
                    break;
                } else {
                    deskTwo.remove(deskTwo.get(j));
                    deskOne.remove(deskOne.get(i));
                    i = -1;
                    break;
                }
            }
        }
        if (deskOne.size() == 0) {
            for (int num : deskTwo) {
                sum += num;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int num : deskOne) {
                sum += num;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}

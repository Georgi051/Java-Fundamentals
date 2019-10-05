package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> wagons = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            wagons.add(Integer.parseInt(input[i]));
        }


        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] typeComand = command.split(" ");

            if (typeComand[0].equals("Add")) {
                wagons.add(Integer.parseInt(typeComand[1]));
            } else {
                int addPassengers = Integer.parseInt(typeComand[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + addPassengers <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + addPassengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
    }
}

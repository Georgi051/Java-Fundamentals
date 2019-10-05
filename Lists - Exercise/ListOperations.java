package Lecutre5Lists.exersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"End".equals(command)) {
            String[] typeComand = command.split("\\s+");

            switch (typeComand[0]) {
                case "Add":
                    int num = Integer.parseInt(typeComand[1]);
                    input.add(num);
                    break;
                case "Insert":
                    int number = Integer.parseInt(typeComand[1]);
                    int index = Integer.parseInt(typeComand[2]);
                    if (index < 0 || index >= input.size()){
                        System.out.println("Invalid index");
                    }else {
                        input.add(index,number);
                    }
                    break;
                case "Remove":
                    int inx = Integer.parseInt(typeComand[1]);
                    if (inx < 0 || inx >= input.size()){
                        System.out.println("Invalid index");
                    }else {
                        input.remove(inx);
                    }
                    break;
                case "Shift":
                    String position = typeComand[1];
                    int count = Integer.parseInt(typeComand[2]);
                    if (position.equals("left")){
                        for (int i = 0; i < count; i++) {
                            int firstElement = input.remove(0);
                            input.add(firstElement);
                        }
                    }else {
                        for (int i = 0; i < count; i++) {
                            int lastElement = input.remove(input.size() - 1);
                            input.add(0,lastElement);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int output : input) {
            System.out.printf("%d ", output);
        }
    }
}

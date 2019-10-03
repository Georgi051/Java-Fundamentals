package Lacture3Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ladybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int fieldSize = Integer.parseInt(scanner.nextLine());

       int[] ladybugIndexes = Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(Integer::parseInt).toArray();
       int[] field = new int[fieldSize];

        for (int i = 0; i < ladybugIndexes.length; i++) {
            if (ladybugIndexes[i] >= 0 && ladybugIndexes[i] < field.length){
                field[ladybugIndexes[i]] = 1;
            }
        }
        String command = scanner.nextLine();
        while (!"end".equals(command)){
            String[] input = command.split(" ");
            int ladybugIndex = Integer.parseInt(input[0]);
            String direction = input[1];
            int flyLength = Integer.parseInt(input[2]);

            if (ladybugIndex < 0 || ladybugIndex >= field.length || field[ladybugIndex] == 0){
                command = scanner.nextLine();
                continue;
            }

            field[ladybugIndex] = 0;
            int currentLength = flyLength;
            switch (direction){
                case "right":
                    while (ladybugIndex + currentLength >= 0 && ladybugIndex + currentLength < field.length){
                        if (field[ladybugIndex + currentLength ] == 0){
                            field[ladybugIndex + currentLength ] = 1;
                            break;
                        }else {
                            currentLength += flyLength;
                        }
                    }
                    break;
                case "left":
                    while (ladybugIndex - currentLength  >= 0 && ladybugIndex - currentLength < field.length){
                        if (field[ladybugIndex - currentLength] == 0){
                            field[ladybugIndex - currentLength] = 1;
                            break;
                        }else {
                            currentLength += flyLength;
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}

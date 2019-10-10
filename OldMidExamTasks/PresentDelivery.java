package ExamsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] field = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        int santaStartIndex = 0;
        String command = scanner.nextLine();
        while (!"Merry Xmas!".equals(command)) {

            String[] inputData = command.split(" ");
            String comand = inputData[0];
            int jumpLenght = Integer.parseInt(inputData[1]);


            if (comand.equals("Jump")) {

                if (santaStartIndex + jumpLenght > field.length - 1) {
                    santaStartIndex = (santaStartIndex + jumpLenght) % field.length;
                }else {
                    santaStartIndex += jumpLenght;
                }

                if (field[santaStartIndex] != 0) {
                    field[santaStartIndex] -= 2;
                } else {
                    System.out.printf("House %d will have a Merry Christmas.\n", santaStartIndex);
                }
            }
            command = scanner.nextLine();
        }
        if (Arrays.stream(field).sum() == 0) {
            System.out.printf("Santa's last position was %d.\nMission was successful.", santaStartIndex);
        } else {
            field = Arrays.stream(field).filter(e -> e > 0).toArray();
            System.out.printf("Santa's last position was %d.\nSanta has failed %d houses.", santaStartIndex, field.length);
        }
    }
}

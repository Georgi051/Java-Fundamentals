package Lacture3Arrays.exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayOne = scanner.nextLine().split(" ");
        String[] arrayTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                if (arrayOne[j].equals(arrayTwo[i])){
                    System.out.print(arrayOne[j] + " ");
                }
            }
        }
    }
}

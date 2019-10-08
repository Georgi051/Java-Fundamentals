package Lecutre8TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        StringBuilder outputData = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
             int length = data[i].length();
             String currentLetter = data[i];
             for (int j = 0; j < length; j++) {
                outputData.append(currentLetter);
            }
        }
        System.out.println(outputData);
    }
}

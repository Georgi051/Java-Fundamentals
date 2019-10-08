package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String file = input[input.length - 1];

        String fileName = file.substring(0,file.lastIndexOf("."));
        String extension = file.substring(file.lastIndexOf(".") + 1);

        System.out.printf("File name: %s\n",fileName);
        System.out.printf("File extension: %s",extension);
    }
}

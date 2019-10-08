package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            String name = input.substring(input.indexOf('@') + 1,input.indexOf('|'));
            String age = input.substring(input.indexOf('#') + 1, input.indexOf('*'));

            System.out.printf("%s is %s years old.\n",name,age);
        }
    }
}

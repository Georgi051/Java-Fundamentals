package Lecutre8TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeWord = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(removeWord);

        while (index != -1){
            String a = text.substring(0,index);
            String b = text.substring(index + removeWord.length());

            text =  a + b;
            index = text.indexOf(removeWord);
        }
        System.out.println(text);
    }
}


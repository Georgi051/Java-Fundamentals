package Lacture3Arrays.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        int index = -1;
        int[] output = new int[n];
        while (n-- != 0) {
            index++;
            char[] name = scanner.nextLine().replaceAll("\\W", "").toCharArray();
            int vowelSum = 0;
            int consonantSum = 0;
            for (int j = 0; j < name.length; j++) {
                boolean isVowel = false;
                for (int k = 0; k < vowel.length; k++) {
                    if (name[j] == vowel[k]) {
                        vowelSum += (name[j] * name.length);
                        isVowel = true;
                        break;
                    }
                }
                    if (!isVowel){
                        consonantSum += (name[j] / name.length);
                    }
            }
            int sum = vowelSum + consonantSum;
            output[index] = sum;
        }
        Arrays.sort(output);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

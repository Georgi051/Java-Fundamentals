package Lacture3Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxIndex = 0;
        int maxLenght = 0;
        for (int i = 0; i < arr.length; i++) {
            int timeLenght = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    timeLenght++;
                    if (timeLenght > maxLenght){
                        maxLenght = timeLenght;
                        maxIndex = i;
                    }
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxLenght; i++) {
            System.out.print(arr[i + maxIndex] + " ");
        }
    }
}

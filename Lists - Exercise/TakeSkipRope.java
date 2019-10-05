package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        List<Integer> nums = new ArrayList<>();
        List<String> words = new ArrayList<>();

        for (int i = 0; i < inputText.length(); i++) {
            if (Character.isDigit(inputText.charAt(i))) {
                int num = Character.getNumericValue((inputText.charAt(i)));
                nums.add(num);
            } else {
                String word = String.valueOf(inputText.charAt(i));
                words.add(word);
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(nums.get(i));
            } else {
                skipList.add(nums.get(i));
            }
        }


        int index = 0;
        List<String> resultPrint = new ArrayList<>();

        for (int j = 0; j < skipList.size(); j++) {
            String temp = takeList(words,index,takeList.get(j));

            index = index + temp.length() + skipList.get(j);

            resultPrint.add(temp);
        }
        for (String s : resultPrint) {
            System.out.print(s);
        }
    }

    static String takeList(List<String> words, int index, int takeListNum) {
        String result = "";

        for (int i = index; i < index + takeListNum; i++) {
            if(i < words.size()) {
                result += words.get(i);
            }
        }
        return result;
    }
}

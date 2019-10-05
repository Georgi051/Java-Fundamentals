package Lecutre5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> first = Arrays.asList(scanner.nextLine().split(" "));
        List<String> second = Arrays.asList(scanner.nextLine().split(" "));

        List<String> result = new ArrayList<>();

        int minSize = 0;
        if (first.size() > second.size()){
            minSize = second.size();
        }else{
            minSize = first.size();
        }

        for (int i = 0; i < minSize; i++) {
            result.add(first.get(i));
            result.add(second.get(i));
        }

        if (first.size() > second.size()){
            result.addAll(first.subList(minSize,first.size()));
        }else {
            result.addAll(second.subList(minSize,second.size()));
        }
        System.out.print(String.join(" ",result));
    }
}

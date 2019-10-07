package Lecutre7AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String,Integer> oddWordMap = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();

            if (oddWordMap.containsKey(wordInLowerCase)){
                oddWordMap.put(wordInLowerCase,oddWordMap.get(wordInLowerCase) + 1);
            }else {
                oddWordMap.put(wordInLowerCase,1);
            }
        }

        List<String> output = new ArrayList<>();

        for (Map.Entry<String, Integer> count : oddWordMap.entrySet()) {

            if (count.getValue() % 2 !=0){
                output.add(count.getKey());
            }
        }

        System.out.println(String.join(", ", output));
    }
}

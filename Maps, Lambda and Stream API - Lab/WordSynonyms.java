package Lecutre7AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>>  words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            words.putIfAbsent(key,new ArrayList<>());
            words.get(key).add(value);
        }

        for (Map.Entry<String, List<String>> wordsPair : words.entrySet()) {
            System.out.printf("%s - %s%n",wordsPair.getKey(),
                    String.join(", ",wordsPair.getValue()));
        }
    }
}

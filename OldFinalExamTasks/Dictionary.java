package OldFinalExamTasks;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,List<String>> wordsAndDef = new TreeMap<>();
        String[] input = scanner.nextLine().split("\\s+\\|\\s+");

        for (String wordAndDef : input) {
            String[] data = wordAndDef.split("\\s*:\\s*");
            String word = data[0];
            wordsAndDef.putIfAbsent(word,new ArrayList<>());

            for (int i = 1; i < data.length; i++) {
                wordsAndDef.get(word).add(data[i]);
            }
        }

        String[] defCheck = scanner.nextLine().split("\\s+\\|\\s+");

        for (String deffEntry : defCheck) {
            if (wordsAndDef.containsKey(deffEntry)){
                System.out.println(deffEntry);
                wordsAndDef.get(deffEntry).stream().sorted((e1,e2)->
                      Integer.compare(e2.length(),e1.length()))
                        .forEach(entry -> System.out.printf("-%s\n",entry));
            }
        }
        String output = scanner.nextLine();
        if (output.equals("List")){
            wordsAndDef.entrySet().forEach(e -> System.out.print(e.getKey()+ " "));
        }

    }
}

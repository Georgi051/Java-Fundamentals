package ExamsTasks;

import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"Stop".equals(command)) {
            String[] data = command.split(" ");
            String typeComand = data[0];

            switch (typeComand) {
                case "Delete":
                    int ind = Integer.parseInt(data[1]) + 1;
                    if (ind >= 0 && ind < words.size()) {
                        words.remove(ind);
                    }
                    break;
                case "Swap":
                    String wordOne = data[1];
                    String wordTwo = data[2];
                    if (words.contains(wordOne) && words.contains(wordTwo)) {
                        int firstInd = words.indexOf(wordOne);
                        int secInd = words.indexOf(wordTwo);
                        Collections.swap(words, firstInd, secInd);
                    }
                    break;
                case "Put":
                    String word = data[1];
                    int indx = Integer.parseInt(data[2]) - 1;
                    if (indx >= 0 && indx <= words.size()) {
                        words.add(indx, word);
                    }
                    break;
                case "Sort":
                    Collections.sort(words);
                    Collections.reverse(words);
                    break;
                case "Replace":
                    String replaceWord = data[1];
                    String listWord = data[2];
                    if (words.contains(listWord)) {
                        int index = words.indexOf(listWord);
                        words.set(index, replaceWord);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

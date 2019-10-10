package OldFinalExamTasks;

import java.util.*;

public class MOBA_Challenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> playersBook = new LinkedHashMap<>();
        Map<String, Integer> totalSum = new HashMap<>();

        String command = scanner.nextLine();
        while (!"Season end".equals(command)) {
            if (command.contains(" -> ")) {
                String[] input = command.split(" -> ");
                String name = input[0];
                String position = input[1];
                int points = Integer.parseInt(input[2]);
                if (!playersBook.containsKey(name)) {
                    playersBook.put(name, new LinkedHashMap<>());
                    playersBook.get(name).put(position, points);
                    totalSum.put(name, points);
                } else {
                    if (!playersBook.get(name).containsKey(position)) {
                        playersBook.get(name).put(position, points);
                    } else {
                        int oldSkill = playersBook.get(name).get(position);
                        if (points > oldSkill) {
                            playersBook.get(name).put(position, points);
                        }
                    }
                    int newValue = totalSum.get(name) + points;
                    totalSum.put(name, newValue);

                }
            } else if (command.contains(" vs ")) {
                String[] input = command.split(" vs ");
                String firstPlayer = input[0];
                String secPlayer = input[1];

                if (playersBook.containsKey(firstPlayer) && playersBook.containsKey(secPlayer)) {
                    Map<String, Integer> firstMap = playersBook.get(firstPlayer);
                    Map<String, Integer> secMap = playersBook.get(secPlayer);

                    if (firstMap.size() > secMap.size()) {
                        for (Map.Entry<String, Integer> firstMapkvp : firstMap.entrySet()) {
                            for (Map.Entry<String, Integer> secMapKvp : secMap.entrySet()) {
                                if (firstMapkvp.getKey().equals(secMapKvp.getKey())) {
                                    biggestValue(playersBook, totalSum, firstPlayer, secPlayer,
                                            firstMap, secMap, firstMapkvp, secMapKvp);
                                }
                            }
                        }
                    } else {
                        for (Map.Entry<String, Integer> secMapKvp : secMap.entrySet()) {
                            for (Map.Entry<String, Integer> firstMapKvp : firstMap.entrySet()) {
                                if (secMapKvp.getKey().equals(firstMapKvp.getKey())) {
                                    biggestValue(playersBook, totalSum, firstPlayer, secPlayer,
                                            firstMap, secMap, firstMapKvp, secMapKvp);
                                }
                            }
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }

        totalSum.entrySet().stream().sorted((e1, e2) ->
                e2.getValue().compareTo(e1.getValue())
        ).forEach(e -> {
            System.out.printf("%s: %d skill\n", e.getKey(), e.getValue());
            for (Map.Entry<String, Map<String, Integer>> entry : playersBook.entrySet()) {
                Map<String, Integer> skill = entry.getValue();
                skill.entrySet().stream().sorted((f, s) -> {
                    int sort = s.getValue().compareTo(f.getValue());
                    if (sort == 0) {
                        sort = f.getKey().compareTo(s.getKey());
                    }
                    return sort;
                }).forEach(pair -> {
                    if (e.getKey().equals(entry.getKey())){
                        System.out.printf("- %s <::> %d%n", pair.getKey(), pair.getValue());
                    }
                });
            }
        });
    }

    private static void biggestValue(Map<String, Map<String, Integer>> playersBook, Map<String, Integer> totalSum,
                                     String firstPlayer, String secPlayer, Map<String, Integer> firstMap, Map<String, Integer> secMap,
                                     Map.Entry<String, Integer> firstMapkvp, Map.Entry<String, Integer> secMapKvp) {
        int firstSum = firstMapkvp.getValue();
        int secSum = secMapKvp.getValue();
        if (firstSum > secSum) {
            if (secMap.size() > 1) {
                secMap.remove(secMapKvp.getKey());
                int newValue = totalSum.get(secPlayer) - secSum;
                totalSum.put(secPlayer, newValue);
            } else {
                playersBook.remove(secPlayer);
                totalSum.remove(secPlayer);
            }
        } else if (secSum > firstSum) {
            if (secMap.size() > 1) {
                firstMap.remove(firstMapkvp.getKey());
                int newValue = totalSum.get(firstPlayer) - firstSum;
                totalSum.put(firstPlayer, newValue);
            } else {
                playersBook.remove(firstPlayer);
                totalSum.remove(firstPlayer);
            }
        }
    }
}

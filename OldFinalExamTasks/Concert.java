package OldFinalExamTasks;

import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> bandBook = new LinkedHashMap<>();
        Map<String, Integer> timeBook = new LinkedHashMap<>();
        int totalTime = 0;
        String command = scanner.nextLine();
        while (!"start of concert".equals(command)) {
            String[] data = command.split("; ");
            String bandName = data[1];
            if (data[0].equals("Add")) {
                String[] members = data[2].split(", ");
                if (!bandBook.containsKey(bandName)) {
                    bandBook.put(bandName, new ArrayList<>());
                    bandBook.get(bandName).addAll(Arrays.asList(members));
                } else {
                    List<String> currentMembers = bandBook.get(bandName);
                    for (String member : members) {
                        if (!currentMembers.contains(member)) {
                            bandBook.get(bandName).add(member);
                        }
                    }
                }
            } else {
                int time = Integer.parseInt(data[2]);
                totalTime += time;
                if (!timeBook.containsKey(bandName)) {
                    timeBook.put(bandName, time);
                } else {
                    int newValue = timeBook.get(bandName) + time;
                    timeBook.put(bandName, newValue);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total time: %d\n", totalTime);
        timeBook.entrySet().stream().sorted((f, s) -> {
            int sort = s.getValue().compareTo(f.getValue());
            if (sort == 0){
                sort = f.getKey().compareTo(s.getKey());
            }
            return sort;
        }).forEach(e -> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));
        String playBand = scanner.nextLine();
        System.out.println(playBand);
        for (String s : bandBook.get(playBand)) {
            System.out.printf("=> %s\n", s);
        }
    }
}

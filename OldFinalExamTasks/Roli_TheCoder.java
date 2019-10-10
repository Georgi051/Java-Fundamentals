package OldFinalExamTasks;

import java.util.*;

public class Roli_TheCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer,LinkedHashMap<String, List<String>>> infoBook = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!"Time for Code".equals(command)){
            String[] input = command.split(" ");
            int id = Integer.parseInt(input[0]);
            String evenName = input[1].substring(1);
            List<String> participants = new ArrayList<>();

            for (int i = 2; i < input.length; i++) {
                participants.add(input[i]);
            }
            if (!command.contains("#")){
                command = scanner.nextLine();
                continue;
            }
            if (!infoBook.containsKey(id)){
                infoBook.put(id,new LinkedHashMap<>());
                infoBook.get(id).put(evenName,new ArrayList<>());
                infoBook.get(id).get(evenName).addAll(participants);
            }else if (!infoBook.get(id).containsKey(evenName)){
                command = scanner.nextLine();
                continue;
            }
            if (infoBook.get(id).containsKey(evenName)){
                for (String participant : participants) {
                    if (!infoBook.get(id).get(evenName).contains(participant)){
                        infoBook.get(id).get(evenName).add(participant);
                    }
                }
                command = scanner.nextLine();
                continue;
            }
            command = scanner.nextLine();
        }

        Map<String,List<String>> outputData = new LinkedHashMap<>();

        for (Map.Entry<Integer, LinkedHashMap<String, List<String>>> entry : infoBook.entrySet()) {
            LinkedHashMap<String, List<String>> value = entry.getValue();
            for (Map.Entry<String, List<String>> e : value.entrySet()) {
                String k = e.getKey();
                List<String> data = e.getValue();
                outputData.put(k, data);
            }
        }
        outputData.entrySet().stream().sorted((f,s)->{
            int sort = s.getValue().size() - f.getValue().size();
            if (sort == 0){
                sort = f.getKey().compareTo(s.getKey());
            }
            return sort;
        }).forEach(entry ->{
            System.out.printf("%s - %d\n",entry.getKey(),entry.getValue().size());

            List<String> toSort = new ArrayList<>(entry.getValue());
            toSort.sort(Comparator.comparing(String::toLowerCase));
            for (String s : toSort) {
                System.out.println(s);
            }
        });
    }
}

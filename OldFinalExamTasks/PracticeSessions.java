package OldFinalExamTasks;

import java.util.*;

public class PracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> racerBook = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String[] input = command.split("->");
            String typeComand = input[0];
            String road = input[1];

            if (typeComand.equals("Add")){
                String racer = input[2];
                if (!racerBook.containsKey(road)){
                    List<String> putRacer = new ArrayList<>();
                    putRacer.add(racer);
                    racerBook.put(road,putRacer);
                }else {
                    List<String> anotherRacer = racerBook.get(road);
                    anotherRacer.add(racer) ;
                    racerBook.put(road,anotherRacer);
                }
            }else if (typeComand.equals("Move")){
                String racer = input[2];
                String nextRoad = input[3];

                List<String> currentRacer = racerBook.get(road);
                if (currentRacer.contains(racer) && racerBook.containsKey(road)){
                    List<String> toAnotherRoad = racerBook.get(nextRoad);

                    if (racerBook.containsKey(nextRoad)){
                        toAnotherRoad.add(racer);
                        racerBook.put(nextRoad,toAnotherRoad);
                        currentRacer.remove(racer);

                    }else {
                        continue;
                    }
                }
            }else if (typeComand.equals("Close")){
                racerBook.remove(road);
            }
            command = scanner.nextLine();
        }
        System.out.println("Practice sessions:");
        racerBook.entrySet().stream().sorted((e1,e2)->{
            int sort = Integer.compare(e2.getValue().size(),e1.getValue().size());
            if (sort == 0){
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(entry -> {
            System.out.printf("%s\n",entry.getKey());
            List<String> racers = entry.getValue();
            for (int i = 0; i < racers.size(); i++) {
                System.out.printf("++%s\n",entry.getValue().get(i));
            }
        } );
    }
}

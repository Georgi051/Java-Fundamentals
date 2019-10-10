package OldFinalExamTasks;

import java.util.*;

public class IronGirder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> townBook = new LinkedHashMap<>();
        Map<String, Integer> timeBook = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!"Slide rule".equals(command)) {
            String[] data = command.split(":");
            String city = data[0];
            String[] typeComandAndTime = data[1].split("->");
            String typeComand = typeComandAndTime[0];
            int passengersCount = Integer.parseInt(typeComandAndTime[1]);

            if (Character.isDigit(typeComand.charAt(0))) {
                int currTime = Integer.parseInt(typeComand);

                if (!townBook.containsKey(city)) {
                    townBook.put(city, passengersCount);
                    timeBook.put(city, currTime);
                } else {
                    int oldTime = timeBook.get(city);
                    int newValue = townBook.get(city) + passengersCount;
                    townBook.put(city, newValue);
                    if (oldTime > currTime || oldTime == 0) {
                        timeBook.put(city, currTime);
                    }
                }
            } else {
                if (timeBook.containsKey(city)) {
                    timeBook.put(city, 0);
                    townBook.put(city, townBook.get(city) - passengersCount);
                }
            }
            command = scanner.nextLine();
        }
        timeBook.entrySet().stream().sorted((e1, e2) -> {
            int sort = e1.getValue().compareTo(e2.getValue());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).filter(entry -> entry.getValue() > 0).forEach(e->{
               int passenger = townBook.get(e.getKey());
                if (passenger > 0 || e.getValue() > 0){
                    System.out.printf("%s -> Time: %d -> Passengers: %d\n"
                            ,e.getKey(),e.getValue(),passenger);
                }
        });
    }
}

package Lecutre7AssociativeArrays.exercise;

import java.util.*;

public class ForceBookSecWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, List<String>> forceBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Lumpawaroo".equals(input)) {

            String[] data = null;

            if (input.contains("|")) {
                data = input.split(" \\| ");
                String forceSide = data[0];
                String forceUser = data[1];

                forceBook.putIfAbsent(forceSide, new ArrayList<>());

                boolean found = false;
                for (Map.Entry<String, List<String>> kvp : forceBook.entrySet()) {
                    if (kvp.getValue().contains(forceUser)) {
                        found = true;
                        break;
                    }
                }

                if (!forceBook.get(forceSide).contains(forceUser) && !found) {
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                data = input.split(" -> ");
                String forceUser = data[0];
                String forceSide = data[1];

                boolean found = false;
                for (Map.Entry<String, List<String>> kvp : forceBook.entrySet()) {
                    if (kvp.getValue().contains(forceUser)) {
                        kvp.getValue().remove(forceUser);
                        forceBook.putIfAbsent(forceSide, new ArrayList<>());
                        forceBook.get(forceSide).add(forceUser);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    forceBook.putIfAbsent(forceSide, new ArrayList<>());
                    forceBook.get(forceSide).add(forceUser);
                }
                System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));
            }

            input = scanner.nextLine();
        }

        forceBook.entrySet().stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(entry -> {
            System.out.println(String.format("Side: %s, Members: %d", entry.getKey()
                    , entry.getValue().size()));

            entry.getValue().stream().sorted(String::compareTo).forEach(user -> {
                System.out.printf("! %s\n", user);
            });

        });
    }
}

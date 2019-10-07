package Lecutre7AssociativeArrays.exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, TreeSet<String>> forceBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Lumpawaroo".equals(input)) {

            String[] data = Arrays.stream(input.split("\\s+\\|\\s+|\\s+->\\s+"))
                    .toArray(String[]::new);

            if (input.contains("|")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                boolean found = false;
                for (Map.Entry<String, TreeSet<String>> kvp : forceBook.entrySet()) {
                    if (kvp.getValue().contains(forceUser)){
                        found = true;
                    }
                }

                if (!found){
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                String forceUser = data[0];
                String forceSide = data[1];

                forceBook.forEach((key, value) -> {
                    value.remove(forceUser);
                });

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!\n",forceUser,forceSide);

            }
            input = scanner.nextLine();
        }
        forceBook.entrySet().stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1,e2)->{
                    int sort = Integer.compare(e2.getValue().size(),e1.getValue().size());

                    if (sort == 0){
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(kvp ->{
            System.out.println(String.format("Side: %s, Members: %d",kvp.getKey(),kvp.getValue().size()));

            kvp.getValue().forEach(u ->
                System.out.printf("! %s\n",u)
            );

        });

    }
}

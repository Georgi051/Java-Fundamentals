package Lecutre7AssociativeArrays.exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> studentsInfoBook = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] input = command.split(" : ");
            String course = input[0];
            String student = input[1];

            if (!studentsInfoBook.containsKey(course)) {
                List<String> name = new ArrayList<>();
                name.add(student);
                studentsInfoBook.put(course, name);
            } else {
                List<String> name = studentsInfoBook.get(course);
                name.add(student);
                studentsInfoBook.put(course, name);
            }
            command = scanner.nextLine();
        }

        studentsInfoBook.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    List<String> names = entry.getValue();
                    Collections.sort(names);
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println("-- " + entry.getValue().get(i));
                    }
                });
    }
}

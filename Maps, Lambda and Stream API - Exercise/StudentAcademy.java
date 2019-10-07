package Lecutre7AssociativeArrays.exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsInfo.putIfAbsent(name,new ArrayList<>());
            studentsInfo.get(name).add(grade);
        }

        LinkedHashMap<String, Double> outputStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsInfo.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble();
            if (avg >= 4.50){
                outputStudents.put(entry.getKey(),avg);
            }
        }
        outputStudents.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
}

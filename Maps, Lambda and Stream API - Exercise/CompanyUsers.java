package Lecutre7AssociativeArrays.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<String>> companyInfoBook = new TreeMap<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String id = data[1];

            companyInfoBook.putIfAbsent(company, new ArrayList<>());
            if (!companyInfoBook.get(company).contains(id)) {
                companyInfoBook.get(company).add(id);
            }

            input = scanner.nextLine();
        }
        companyInfoBook.entrySet().stream()
                .forEach(entry -> {
                    System.out.printf("%s%n", entry.getKey());
                    List<String> id = entry.getValue();
                    for (String s : id) {
                        System.out.printf("-- %s%n",s);
                    }
                });
    }
}

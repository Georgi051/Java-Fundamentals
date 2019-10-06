package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!"End".equals(command)) {
            String[] input = command.split(" ");
            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);

            Person person = new Person(name, id, age);

            personList.add(person);

            personList.sort((f , s) -> f.getAge() - s.getAge());

            command = scanner.nextLine();
        }
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}

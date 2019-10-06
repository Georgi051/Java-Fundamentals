package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Person{
        private  String name;
        private  String lastName;
        private  double grade;

        public Person(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.name,this.lastName,this.grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> studentsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split(" ");
            String name = input[0];
            String lastName  = input[1];
            double grade = Double.parseDouble(input[2]);

            Person person = new Person(name,lastName,grade);
            studentsList.add(person);

            studentsList.sort(Comparator.comparingDouble(Person::getGrade).reversed());
        }

        for (Person students : studentsList) {
            System.out.println(students);
        }
    }
}

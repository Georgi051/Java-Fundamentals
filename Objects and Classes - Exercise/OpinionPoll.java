package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static class People{
       private String name;
       private int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%s - %d",this.name,this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<People> peopleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            People people = new People(name,age);
            peopleList.add(people);

            peopleList.sort((f,s)-> f.getName().compareTo(s.getName()));
        }

        for (People people : peopleList) {
            if (people.getAge() > 30){
                System.out.println(people);
            }
        }
    }
}

package Lecutre6ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Students {
    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public void setFirstName(String firstName) {
        }

        public void setLastName(String lastName) {

        }

        public void setAge(int age) {

        }

        public void setCity(String city) {


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] input = command.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String city = input[3];


            if (IsStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

            command = scanner.nextLine();
        }
        String city = scanner.nextLine();


        for (Student student : students) {
            if (student.getCity().equals(city)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}


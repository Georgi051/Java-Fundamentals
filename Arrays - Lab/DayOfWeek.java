package Lacture3Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String [] daysOfWeek = {
           "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
        };

        if (day < 1 || day > 7 ){
            System.out.println("Invalid day!");
        }else {
            System.out.println(daysOfWeek[day - 1]);
        }
    }
}

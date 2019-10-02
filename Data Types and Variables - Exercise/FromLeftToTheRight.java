package Lacture2.MoreExercise1;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String number = scanner.nextLine();
            String [] parts = number.split(" ");

            long one = Long.parseLong(parts[0]);
            long two = Long.parseLong(parts[1]);

            long biggerNum = one;
            if (one < two){
               biggerNum = two;
            }

            long sum = 0;
            while (biggerNum != 0){
                sum += biggerNum % 10;
                biggerNum /= 10;
            }
            System.out.println(Math.abs(sum));
        }
    }
}

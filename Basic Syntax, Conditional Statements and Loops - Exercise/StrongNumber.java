package Lecture1;

import java.util.Scanner;

public class StrongNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            int fact = 1;

            for (int j = 1; j <= number ; j++) {
                fact *= j;
            }
            sum += fact;
        }
        if (num.equals(String.valueOf(sum))){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        //System.out.println(num.equals(String.valueOf(sum))?"yes" : "no");
    }
}

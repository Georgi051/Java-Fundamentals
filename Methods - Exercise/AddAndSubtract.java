package Lecture4Methods.exersise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        System.out.println(sum(one,two) - three);

    }
    static int sum (int a,int b){
        int sum = a + b;
        return sum;
    }
}

package Lecture4Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            PrintTriangleM(i);
        }
        for (int i = n - 1; i > 0 ; i--) {
            PrintTriangleM(i);
        }
    }

     static void PrintTriangleM(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

package Lacture2;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isTrue = false;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            if (isTrue){
                System.out.printf("%d -> True\n",i);
            }else{
                System.out.printf("%d -> False\n",i);

            }
        }
    }
}

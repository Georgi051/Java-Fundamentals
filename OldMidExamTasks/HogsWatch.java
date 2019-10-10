package ExamsTasks;

import java.util.Scanner;

public class HogsWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int homeToVisit = Integer.parseInt(scanner.nextLine());
        int presents = Integer.parseInt(scanner.nextLine());

        int sumReturnPresents = 0;
        int tempPresents = presents;
        int countMorePresent = 0;

        for (int i = 1; i <= homeToVisit; i++) {
            int numsOfChild = Integer.parseInt(scanner.nextLine());

            if (presents >= numsOfChild) {
                presents -= numsOfChild;
            } else {
                countMorePresent++;
                int lack = Math.abs(presents - numsOfChild);
                int leftDay = homeToVisit - i;
                presents = (tempPresents / i) * leftDay + lack;
                sumReturnPresents += presents;
                presents -= lack;
            }
        }
        if (countMorePresent != 0) {
            System.out.println(countMorePresent);
            System.out.println(sumReturnPresents);
        } else {
            System.out.println(presents);
        }
    }
}

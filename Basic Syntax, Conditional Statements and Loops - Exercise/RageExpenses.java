package Lecture1;

import java.util.Scanner;

public class RageExpenses {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int crashedKeyboard = 0;
        int crashedMouse = 0;
        int crashedHeadSet = 0;
        int crashedDisplay = 0;

        for (int i = 1; i <= lostGame; i++) {

             if (i % 2 == 0){
                crashedHeadSet++;
            }
             if (i % 3 == 0){
                crashedMouse++;
            }
             if (i % 6 == 0){
                crashedKeyboard++;
            }
             if (i % 12 == 0){
                 crashedDisplay++;
             }
        }

        double totalSum = crashedHeadSet * headSetPrice + crashedMouse * mousePrice + crashedKeyboard * keyboardPrice +
                crashedDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",totalSum);
    }
}

package ExamsTasks;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companions = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int coins = days * 50;

        for (int i = 1; i <= days; i++) {
            if (i % 10 == 0){
                companions -= 2;
            }

            if (i % 15 == 0){
                companions += 5;
            }

            if (i % 3 == 0){
                coins -= (3 * companions);
            }

            if (i % 5 == 0){
                int earnCoins = 20;
                coins += (earnCoins * companions);
                if (i % 3 == 0){
                    coins -= (2 * companions);
                }
            }
            coins -= (2 * companions);
        }
        int coinsPerPerson = coins / companions;
        System.out.printf("%d companions received %d coins each.",companions,coinsPerPerson);
    }
}

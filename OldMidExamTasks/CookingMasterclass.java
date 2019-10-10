package ExamsTasks;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());   // for package
        double priceOfEgg = Double.parseDouble(scanner.nextLine());     // for single egg
        double priceOfApron = Double.parseDouble(scanner.nextLine());  // for single apron

        double freeFlour = students / 5;

        double sum = priceOfApron * Math.ceil(students * 1.2) + priceOfEgg * 10 * students +
                priceOfFlour * (students - freeFlour);

        if (sum <= budget){
            System.out.printf("Items purchased for %.2f$.",sum);
        }else {
            System.out.printf("%.2f$ more needed.",sum - budget);
        }
    }
}

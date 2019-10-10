package ExamsTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class SeizeTheFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firesWithTheirCells = scanner.nextLine().split("#");

        int wather = Integer.parseInt(scanner.nextLine());
        double effort = 0;
        int totalFire = 0;
        ArrayList<Integer> strukture = new ArrayList<>();

        for (int i = 0; i < firesWithTheirCells.length; i++) {
            String[] input = firesWithTheirCells[i].split(" = ");
            String typeFire = input[0];
            int fireRange = Integer.parseInt(input[1]);

            switch (typeFire) {
                case "High":
                    if (wather < fireRange){
                        break;
                    }
                    if (fireRange >= 81 && fireRange <= 125) {
                        wather -= fireRange;
                        effort += fireRange * 0.25;
                        totalFire += fireRange;
                        strukture.add(fireRange);
                    } else {
                        break;
                    }
                    break;
                case "Medium":
                    if (wather < fireRange){
                        break;
                    }
                    if (fireRange >= 51 && fireRange <= 80) {
                        wather -= fireRange;
                        effort += fireRange * 0.25;
                        totalFire += fireRange;
                        strukture.add(fireRange);
                    } else {
                        break;
                    }
                    break;
                case "Low":
                    if (wather < fireRange){
                        break;
                    }
                    if (fireRange >= 1 && fireRange <= 50) {
                        wather -= fireRange;
                        effort += fireRange * 0.25;
                        totalFire += fireRange;
                        strukture.add(fireRange);
                    } else {
                        break;
                    }
            }
        }
        System.out.println("Cells:");
        for (int k: strukture) {
            System.out.println("- " + k);
        }
        System.out.printf("Effort: %.2f\n", effort);
        System.out.printf("Total Fire: %d", totalFire);
    }
}
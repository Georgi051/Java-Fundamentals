package ExamsTasks.ExamTasks;

import java.util.Scanner;

public class GiftBoxCoverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sizeOfASide = Double.parseDouble(scanner.nextLine());
        int numberOfSheetsOfPaper = Integer.parseInt(scanner.nextLine());
        double areaForSingleSheetsCover = Double.parseDouble(scanner.nextLine());

        double area = sizeOfASide * sizeOfASide * 6;

        int smallSheetsPaper = numberOfSheetsOfPaper / 3;
        int normalSheetsPaper = numberOfSheetsOfPaper - smallSheetsPaper;

        double smallCover = smallSheetsPaper * (areaForSingleSheetsCover * 0.25);
        double normalCover = normalSheetsPaper * areaForSingleSheetsCover;

        double all = smallCover + normalCover;

        System.out.printf("You can cover %.2f%% of the box.",all * 100 / area);

    }
}

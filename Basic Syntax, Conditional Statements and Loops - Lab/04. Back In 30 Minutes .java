package Lecture1;

        import java.util.Scanner;

public class BackIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlus30 = minutes + 30;
        if (minutesPlus30 > 59){
            hours++;
            minutesPlus30 -= 60;
        }
        if (hours > 23){
            hours = 0;
        }


        System.out.printf("%d:%02d",hours,minutesPlus30);
    }
}
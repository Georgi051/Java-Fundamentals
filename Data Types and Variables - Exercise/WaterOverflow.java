package Lacture2;

        import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            sum += quantities;
            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum -= quantities;
            }
        }
        System.out.println(sum);
    }
}

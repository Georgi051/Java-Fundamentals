import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < num ; i++) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d",sum);
    }

}
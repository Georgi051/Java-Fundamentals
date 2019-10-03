package Lacture3Arrays;

        import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            nums[i] += number;
        }
        for (int i = nums.length -1 ; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}

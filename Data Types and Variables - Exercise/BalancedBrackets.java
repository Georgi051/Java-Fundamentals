package Lacture2.MoreExercise1;

        import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int openBrackets = 0;
        int closedBrackets = 0;
        boolean isEqual = false;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openBrackets++;
                isEqual = false;
            }else if (input.equals(")")) {
                closedBrackets++;
                isEqual = true;
            }
        }
        if (isEqual && (openBrackets == closedBrackets)) {
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}

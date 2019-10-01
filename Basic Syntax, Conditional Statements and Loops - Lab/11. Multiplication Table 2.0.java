import java.util.Scanner;

public class test {
    public static void MultiplicationTableSecondVersion (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

          if (multiplier > 10){
              int sum = num * multiplier;
              System.out.printf("%d X %d = %d\n",num,multiplier,sum);
          }else {
              for (int i = multiplier; i <= 10; i++) {
                  int sum = num * i;
                  System.out.printf("%d X %d = %d\n",num,i,sum);
              }
          }


    }
}
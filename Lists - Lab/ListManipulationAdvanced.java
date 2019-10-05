package Lecutre5Lists;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] comandData = command.split(" ");
            String comandType = comandData[0];

            switch (comandType) {
                case "Contains":
                    int number = Integer.parseInt(comandData[1]);
                    if (nums.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String type = comandData[1];
                    if (type.equals("even")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) % 2 == 0) {
                                printResult(nums, i);
                            }
                        }
                    } else if (type.equals("odd")) {
                        for (int i = 0; i < nums.size(); i++) {
                            if (nums.get(i) % 2 != 0) {
                                printResult(nums, i);
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    String get = comandData[1];
                    int sum = 0;
                    if (get.equals("sum")) {
                        for (int i = 0; i < nums.size(); i++) {
                            sum += nums.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String operators  = comandData[1];
                    int num = Integer.parseInt(comandData[2]);
                    switch (operators ) {
                        case "<":
                            for (int i = 0; i < nums.size(); i++) {
                                if (nums.get(i) < num) {
                                    printResult(nums, i);
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < nums.size(); i++) {
                                if (nums.get(i) > num) {
                                    printResult(nums, i);
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < nums.size(); i++) {
                                if (nums.get(i) >= num) {
                                    printResult(nums, i);
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < nums.size(); i++) {
                                if (nums.get(i) <= num) {
                                    printResult(nums, i);
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
    private static void printResult(List<Integer> nums, int i) {
        System.out.print(nums.get(i) + " ");
    }
}

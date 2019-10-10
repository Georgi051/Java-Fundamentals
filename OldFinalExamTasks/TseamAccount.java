package OldFinalExamTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TseamAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> account = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"Play!".equals(command)) {
            if (command.contains("-")) {
                String[] input = command.split("[ |-]");
                String game = input[1];
                String expansion = input[2];
                if (account.contains(game)) {
                    int index = account.indexOf(game);
                    String currGame = account.get(index) + ":" + expansion;
                    account.add(index + 1, currGame);
                }
            } else {
                String[] input = command.split(" ");
                String game = input[1];
                switch (input[0]) {
                    case "Install":
                        if (!account.contains(game)) {
                            account.add(game);
                        }
                        break;
                    case "Uninstall":
                        account.remove(game);
                        break;
                    case "Update":
                        if (account.contains(game)) {
                            int indx = account.indexOf(game);
                            String currGame = account.get(indx);
                            account.remove(game);
                            account.add(currGame);
                        }
                        break;
                }
            }
            command = scanner.nextLine();
        }
        account.forEach(element -> System.out.printf("%s ", element));
    }
}

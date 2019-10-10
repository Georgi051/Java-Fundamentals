package ExamsTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"Finished!".equals(command)) {
            String[] input = command.split(" ");
            String type = input[0];
            String kidName = input[1];

            switch (type) {
                case "Bad":
                    if (!(initialList.contains(kidName))) {
                        initialList.add(0, kidName);
                    }
                    break;
                case "Good":
                    if (initialList.contains(kidName)) {
                        initialList.remove(kidName);
                    }
                    break;
                case "Rename":
                    String newName = input[2];
                    int oldnameInd = initialList.indexOf(kidName);
                    if (initialList.contains(kidName)) {
                        initialList.set(oldnameInd,newName);
                    }
                    break;
                case "Rearrange":
                    if (initialList.contains(kidName)) {
                        String temp = kidName;
                        initialList.remove(kidName);
                        initialList.add(temp);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < initialList.size(); i++) {
            if (i == initialList.size() - 1){
                System.out.printf("%s",initialList.get(i));
            }else {
                System.out.printf("%s, ",initialList.get(i));
            }
        }
    }
}

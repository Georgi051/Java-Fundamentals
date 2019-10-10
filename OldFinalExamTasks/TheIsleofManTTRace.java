package OldFinalExamTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleofManTTRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([\"#$%*&])([A-za-z]+)\\1=(\\d+)!!(.+)";
        Pattern pattern = Pattern.compile(regex);
        while (true){
            String input = scanner.nextLine();
            Matcher data = pattern.matcher(input);
            while (data.find()){
                int length = Integer.parseInt(data.group(3));

                if (length == data.group(4).length()){
                    String outputData = "";
                    for (int i = 0; i < data.group(4).length(); i++) {
                        char letter = data.group(4).charAt(i);
                        outputData += (char)(letter + length);
                    }
                    System.out.printf("Coordinates found! %s -> %s",data.group(2),outputData);
                    return;
                }
            }
            System.out.println("Nothing found!");
        }
    }
}

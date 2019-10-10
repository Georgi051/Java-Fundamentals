package ExamsTasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> gifts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!"No Money".equals(command)){
            String[] input = command.split(" ");
            String possibleCommands = input[0];
            String gift = input[1];
            switch (possibleCommands){
                case "OutOfStock":
                    while (gifts.contains(gift)){
                        int indx = gifts.indexOf(gift);
                        gifts.set(indx,"None");
                    }
                    break;
                case "Required":
                    int giftIndex = Integer.parseInt(input[2]);
                    if (giftIndex >= 0 && giftIndex < gifts.size()){
                        gifts.set(giftIndex,gift);
                    }
                    break;
                case "JustInCase":
                    gifts.set(gifts.size()-1,gift);
                    break;
            }
            command = scanner.nextLine();
        }
        for (String gift : gifts) {
            if (!gift.equals("None")){
                System.out.print(gift + " ");
            }
        }
    }
}

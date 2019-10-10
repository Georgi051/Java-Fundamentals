package ExamsTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> paintings = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String [] input = command.split(" ");
            String typeComand = input[0];
            switch (typeComand){
                case "Change":
                    int paintingNumber = Integer.parseInt(input[1]);
                    int changedNumber = Integer.parseInt(input[2]);

                    int indPaintNum = paintings.indexOf(paintingNumber);
                    if (paintings.contains(paintingNumber)){
                        paintings.set(indPaintNum,changedNumber);
                    }
                    break;
                case "Hide":
                    int paintingNumberH = Integer.parseInt(input[1]);
                    int indexOfRemoveNum = paintings.indexOf(paintingNumberH);
                    if (paintings.contains(paintingNumberH)){
                        paintings.remove(indexOfRemoveNum);
                    }

                    break;
                case "Switch":
                    int paintingNumberSOne = Integer.parseInt(input[1]);
                    int paintingNumberSTwo = Integer.parseInt(input[2]);

                    int firstIndex = paintings.indexOf(paintingNumberSOne);
                    int secIndex = paintings.indexOf(paintingNumberSTwo);

                    if (paintings.contains(paintingNumberSOne) && paintings.contains(paintingNumberSTwo)){
                         paintings.set(firstIndex,paintingNumberSTwo);
                         paintings.set(secIndex,paintingNumberSOne);
                    }
                     break;
                case "Insert":
                    int place = Integer.parseInt(input[1]);
                    int paintingNumberI = Integer.parseInt(input[2]);
                    if (place >= 0 && place < paintings.size()){
                        paintings.add(place + 1,paintingNumberI);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(paintings);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer painting : paintings) {
            System.out.printf("%d ",painting);
        }
    }
}

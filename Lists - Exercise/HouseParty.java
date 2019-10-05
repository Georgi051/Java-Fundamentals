package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comandNum = Integer.parseInt(scanner.nextLine());

        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < comandNum; i++) {
            String input = scanner.nextLine();
            String[] token = input.split("\\s+");
            String name = token[0];
            if (input.contains("is going!")) {
                if (nameList.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    nameList.add(name);
                }
            } else {
                if (!nameList.remove(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        for (String name : nameList) {
            System.out.printf("%s\n",name);
        }
    }
}

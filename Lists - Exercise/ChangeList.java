package Lecutre5Lists.exersice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        String command = scanner.nextLine();
        while (!"end".equals(command)){
            String[] typeComand = command.split("\\s+");
            int element = Integer.parseInt(typeComand[1]);

            if (typeComand[0].equals("Delete")){
                if (list.contains(element)){
                    list.removeAll(Collections.singleton(element));
                }
            }else if (typeComand[0].equals("Insert")){
                int position = Integer.parseInt(typeComand[2]);
                if (position >= 0 && position < list.size()){
                    list.add(position,element);
                }
            }
            command = scanner.nextLine();
        }
        for (int output : list) {
            System.out.printf("%d ",output);
        }

    }
}

package Lecutre7AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,String> parkingBook = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String typeComand = input[0];
            String name = input[1];

            if (typeComand.equals("register")){
                String regNum = input[2];
                if (!parkingBook.containsKey(name)){
                    parkingBook.put(name,regNum);
                    System.out.printf("%s registered %s successfully%n",name,regNum);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",regNum);
                }
            }else if (typeComand.equals("unregister")){
                if (!parkingBook.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else {
                    parkingBook.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }
            }
        }
        parkingBook.forEach((key,value) ->
                System.out.printf("%s => %s%n",key,value)
                );
    }
}

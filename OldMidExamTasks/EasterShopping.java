package ExamsTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shopList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String typeComand = input[0];

            switch (typeComand){
                case "Include":
                    String shop = input[1];
                    shopList.add(shop);
                    break;
                case "Visit":
                    String firstOrLast = input[1];
                    int numShop = Integer.parseInt(input[2]);
                    if (numShop <= shopList.size()){
                        switch (firstOrLast){
                            case "first":
                                shopList.removeAll(shopList.subList(0,numShop));
                                break;
                            case "last":
                                shopList.removeAll(shopList.subList(shopList.size() - numShop,shopList.size()));
                                break;
                        }
                    }
                    break;
                case "Prefer":
                    int indxOne = Integer.parseInt(input[1]);
                    int indxTwo = Integer.parseInt(input[2]);
                    if (indxOne >= 0 && indxOne < shopList.size() && indxTwo >= 0 && indxTwo < shopList.size()){
                        Collections.swap(shopList,indxOne,indxTwo);
                    }
                    break;
                case "Place":
                    String currShop = input[1];
                    int index = Integer.parseInt(input[2]) + 1;
                    if (index >= 0 && index < shopList.size()){
                        shopList.add(index,currShop);
                    }
                    break;
            }
        }
        System.out.println("Shops left:");
        for (String s : shopList) {
            System.out.print(s + " ");
        }
    }
}

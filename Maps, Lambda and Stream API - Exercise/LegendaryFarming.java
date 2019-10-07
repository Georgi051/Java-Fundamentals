package Lecutre7AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Integer> item = new LinkedHashMap<>();

        TreeMap<String,Integer> junk = new TreeMap<>();

        item.put("shards",0);
        item.put("fragments",0);
        item.put("motes",0);

        String material = " ";

        boolean flag = false;

        while(true) {
            String[] inputData = scanner.nextLine().split("\\s+");

            for (int i = 0; i < inputData.length; i += 2) {
                String key = inputData[i + 1].toLowerCase();
                int value = Integer.parseInt(inputData[i]);

                if (item.containsKey(key)) {
                    int oldValue = item.get(key) + value;
                    item.put(key, oldValue);
                    if (item.get(key) >= 250) {
                        int newValue = item.get(key) - 250;
                        item.put(key, newValue);

                        material = key;
                        flag = true;
                        break;
                    }
                } else if (!junk.containsKey(key)) {
                    junk.put(key, value);
                } else {
                    int oldValue = junk.get(key) + value;
                    junk.put(key, oldValue);
                }
            }
            if (flag){
                break;
            }
        }

        if (material.equals("motes")){
            System.out.println("Dragonwrath obtained!");
        }else if (material.equals("shards")){
            System.out.println("Shadowmourne obtained!");
        }else if (material.equals("fragments")){
            System.out.println("Valanyr obtained!");
        }
        item.entrySet().stream().sorted((e1,e2) -> {
            int sort = Integer.compare(e2.getValue(),e1.getValue());

            if (sort == 0){
                sort = e1.getKey().compareTo(e2.getKey());
            }

            return sort;
        }).forEach(e -> System.out.printf("%s: %d%n",e.getKey(),e.getValue()));

        junk.entrySet().stream().forEach(e -> System.out.printf("%s: %d%n",e.getKey(),e.getValue()));
    }
}

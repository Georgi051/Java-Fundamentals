package Lecutre5Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<String> input = Arrays.asList(scanner.nextLine().split(" "));

//        List<Double> nums = new ArrayList<>();

//        for (int i = 0; i < input.size(); i++) {
//            nums.add(Double.parseDouble(input.get(i)));
//        }
        List<Double> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i).equals(nums.get(i + 1))){
                nums.set(i,nums.get(i) + nums.get(i + 1));
                nums.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinDelimeterElements(nums, " "));
    }
    static String joinDelimeterElements(List<Double> items , String delimeter){
        String output = "";
        for (Double num : items) {
            output += (new DecimalFormat("0.##").format(num) + delimeter);
        }
        return output;
    }
}

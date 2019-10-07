
package Lecutre7AssociativeArrays;


import java.util.*;

public class AssociativeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToDouble(Double::parseDouble).toArray();


        Map<Double,Integer> someMap = new TreeMap<>();

        for (double num : nums) {
            if (!someMap.containsKey(num)){
               someMap.put(num,0);
            }
            int oldValue = someMap.get(num);
            someMap.put(num, oldValue + 1);
        }

        for (Map.Entry<Double, Integer> pair : someMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",pair.getKey(),pair.getValue());
        }
    }
}

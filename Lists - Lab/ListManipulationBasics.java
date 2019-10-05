package Lecutre5Lists;

import java.util.*;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.asList(scanner.nextLine().split(" "));

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            nums.add(Integer.parseInt(input.get(i)));
        }

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] comandData = command.split(" ");
            String comandType = comandData[0];

            switch (comandType) {
                case "Add":
                    int num = Integer.parseInt(comandData[1]);
                    nums.add(num);
                    break;
                case "Remove":
                    int numR = Integer.parseInt(comandData[1]);
                    nums.removeAll(Collections.singleton(numR));
                    //Вариант 2: while(nums.remove(Integer.valueOf(numR))){
                    //}
                    nums.remove(new Integer(numR));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(comandData[1]);
                    nums.remove(index);
                    break;
                case "Insert":
                    int number = Integer.parseInt(comandData[1]);
                    int indx = Integer.parseInt(comandData[2]);
                    nums.add(indx, number);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer num : nums) {
            System.out.print(num + " ");
        }

    }
}

package ExamsTasks;

import java.util.*;
import java.util.stream.Collectors;

public class GrainsOfSand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"Mort".equals(command)) {
            String[] input = command.split("\\s+");
            String typeComand = input[0];
            int value = Integer.parseInt(input[1]);

            switch (typeComand) {
                case "Add":
                    nums.add(value);
                    break;
                case "Remove":
                    if (nums.contains(value)) {
                        nums.remove(Integer.valueOf(value));
                    } else {
                        if (value >= 0 && value < nums.size() - 1) {
                            nums.remove(value);
                        }
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(input[2]);
                    if (nums.contains(value)) {
                        int indx = nums.indexOf(value);
                        nums.set(indx, replacement);
                    }
                    break;
                case "Increase":
                    List<Integer> result = new ArrayList<>();
                    int increseNum = Integer.MIN_VALUE;

                    if (nums.contains(value)){
                        for (Integer num : nums) {
                            if (num >= value){
                                increseNum = num;
                                break;
                            }
                        }
                        for (Integer listNum : nums) {
                            result.add(listNum + increseNum);
                        }

                        nums = result;
                    }else {
                        for (Integer listNum : nums) {
                            result.add(listNum + nums.get(nums.size()- 1));
                        }

                        nums = result;
                    }
                    break;
                case "Collapse":
                    for (int i = 0; i < nums.size(); i++) {
                        if (value > nums.get(i)) {
                            nums.remove(nums.get(i));
                            i = -1;
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}

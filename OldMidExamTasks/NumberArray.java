package ExamsTasks.ExamTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!"End".equals(command)){
            String[] inputData = command.split("\\s+");
            String typeComand = inputData[0];

            switch (typeComand){
                case "Switch":
                 int indx = Integer.parseInt(inputData[1]);
                 if (indx >= 0 && indx < numsList.size()){
                     int num = numsList.get(indx);

                     if (num > 0){
                         num = -num;
                     }else if (num < 0){
                         num = +num;
                     }else {
                         num = num;
                     }
                     numsList.set(indx,num);
                 }
                    break;
                case "Change":
                    int inx = Integer.parseInt(inputData[1]);
                    int value = Integer.parseInt(inputData[2]);
                    if (inx >= 0 && inx < numsList.size()){
                        numsList.set(inx,value);
                    }
                    break;
                case "Sum":
                    int sum = 0;
                    String[] type = command.split(" ");
                    String option = type[1];
                    if (option.equals("Negative")){
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) < 0){
                                sum += numsList.get(i);
                            }
                        }
                    }else if (option.equals("Positive")){
                        for (int i = 0; i < numsList.size(); i++) {
                            if (numsList.get(i) >= 0){
                                sum += numsList.get(i);
                            }
                        }
                    }else if (option.equals("All")){
                        for (int integer : numsList) {
                            sum += integer;
                        }
                    }
                    System.out.println(sum);
                    break;
            }
            command = scanner.nextLine();

        }
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) >= 0){
                System.out.print(numsList.get(i) + " ");
            }
        }
    }
}

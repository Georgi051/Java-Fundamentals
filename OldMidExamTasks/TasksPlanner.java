package ExamsTasks.ExamTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TasksPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> taskList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] inputData = command.split("\\s+");
            String type = inputData[0];
            switch (type) {
                case "Complete":
                    int inx = Integer.parseInt(inputData[1]);
                    if (inx >= 0 & inx < taskList.size()){
                        taskList.set(inx,0);
                    }
                    break;
                case "Change":
                    int indx = Integer.parseInt(inputData[1]);
                    int time = Integer.parseInt(inputData[2]);
                    if (indx >= 0 & indx < taskList.size()){
                        taskList.set(indx,time);
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(inputData[1]);
                    if (index >= 0 & index < taskList.size()){
                        taskList.set(index,-1);
                    }
                    break;
                case "Count":
                    String[] typeComand = command.split(" ");
                    String option = typeComand[1];
                    int count = 0;
                        if (option.equals("Completed")){
                            for (int  task : taskList) {
                                if (task == 0 ){
                                    count++;
                                }
                            }
                        }else if (option.equals("Incomplete")){
                            for (int  task : taskList) {
                                if (task > 0 ){
                                    count++;
                                }
                            }
                        }else if (option.equals("Dropped")){
                            for (int  task : taskList) {
                                if (task == -1 ){
                                    count++;
                                }
                            }

                        }
                    System.out.println(count);

                    break;
            }
            command = scanner.nextLine();
        }
        for (int task : taskList) {
            if (task > 0 ){
                System.out.print(task + " ");
            }
        }
    }
}

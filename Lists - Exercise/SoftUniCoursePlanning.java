package Lecutre5Lists.exersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"course start".equals(command)) {
            String[] input = command.split(":");
            String typeCommand = input[0];
            String lessonTitle = input[1];

            switch (typeCommand) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    int indxLesson = schedule.indexOf(lessonTitle);

                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle + "-Exercise")) {
                        schedule.remove(indxLesson);
                        schedule.remove(lessonTitle + "-Exercise");
                    }else if (schedule.contains(lessonTitle)){
                    schedule.remove(indxLesson);
                    }
                    break;
                case "Swap":
                    String swapTitle = input[2];
                    String exiciseOne = lessonTitle + "-Exercise";
                    String exiciseTwo = swapTitle + "-Exercise";

                    int firstInx = schedule.indexOf(lessonTitle);
                    int secInx = schedule.indexOf(swapTitle);

                    if (schedule.contains(lessonTitle) && schedule.contains(swapTitle)) {
                        if (schedule.contains(exiciseOne) && schedule.contains(exiciseTwo)){
                            Swap(schedule, lessonTitle, swapTitle, firstInx, secInx);

                            String exOneSwap = schedule.get(schedule.indexOf(lessonTitle+1));
                            String exTwoSwap = schedule.get(schedule.indexOf(swapTitle+1));

                            schedule.set(firstInx + 1, exTwoSwap);
                            schedule.set(secInx + 1, exOneSwap);

                        }else if (schedule.contains(exiciseOne) || schedule.contains(exiciseTwo)){
                            if (schedule.contains(exiciseOne)){
                                String lesson = schedule.get(schedule.indexOf(lessonTitle));
                                String swap = schedule.get(schedule.indexOf(swapTitle));

                                schedule.set(firstInx, swap);
                                schedule.set(secInx, lesson);

                                schedule.remove(exiciseOne);
                                schedule.add(secInx + 1,exiciseOne);

                            }else {
                                String lesson = schedule.get(schedule.indexOf(lessonTitle));
                                String swap = schedule.get(schedule.indexOf(swapTitle));

                                schedule.set(firstInx, swap);
                                schedule.set(secInx, lesson);

                                schedule.remove(exiciseTwo);
                                schedule.add(firstInx + 1,exiciseTwo);
                            }
                        } else{
                            String lesson = schedule.get(schedule.indexOf(lessonTitle));
                            String swap = schedule.get(schedule.indexOf(swapTitle));
                            schedule.set(firstInx, swap);
                            schedule.set(secInx, lesson);
                        }
                    }
                    break;
                case "Exercise":
                    if (schedule.contains(lessonTitle)) {
                        int inx = schedule.indexOf(lessonTitle);
                        schedule.add(inx + 1, lessonTitle + "-Exercise");
                    } else {
                        schedule.add(lessonTitle);
                        schedule.add(lessonTitle + "-Exercise");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, schedule.get(i));
        }
    }

    public static void Swap(List<String> schedule, String lessonTitle,
                            String swapTitle, int firstInx, int secInx) {

        String lesson = schedule.get(schedule.indexOf(lessonTitle));
        String swap = schedule.get(schedule.indexOf(swapTitle));

        schedule.set(firstInx, swap);
        schedule.set(secInx, lesson);
    }
}

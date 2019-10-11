package FinalExam;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String output = "";
        String command = scanner.nextLine();
        while (!"End".equals(command)){
            String[] data = command.split(" ");

            switch (data[0]){
                case "Add":
                    output+= data[1];
                    break;
                case "Upgrade":
                    char currentChar = data[1].charAt(0);
                    for (int i = 0; i < output.length(); i++) {
                        char letter = output.charAt(i);
                        if (letter == currentChar){
                            output = output.replace(letter,(char)(letter+1));
                            break;
                        }
                    }
                    break;
                case "Print":
                    System.out.println(output);
                    break;
                case "Index":
                    boolean isFound = false;
                    char letter = data[1].charAt(0);
                    for (int i = 0; i < output.length(); i++) {
                        char currLetter = output.charAt(i);
                        if (letter == currLetter){
                            System.out.print(i + " ");
                            isFound = true;
                        }
                    }
                    if (!isFound){
                        System.out.print("None");
                    }
                    System.out.println();
                    break;
                case "Remove":
                    String delete = data[1];
                    output = output.replace(delete,"");
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

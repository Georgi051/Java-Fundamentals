package Lacture2.MoreExercise1;


import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!"END".equals(command)){

            boolean isInt = true;
            try {
                int integer = Integer.parseInt(command);
            }catch (NumberFormatException e){
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double dub = Double.parseDouble(command);
            }catch (NumberFormatException e){
                isDouble = false;
            }

            if (isInt){
                System.out.printf("%s is integer type\n",command);
            }else if (isDouble){
                System.out.printf("%s is floating point type\n",command);
            }else if (command.equalsIgnoreCase("true") || command.equalsIgnoreCase("false")){
                System.out.printf("%s is boolean type\n",command);
            }else if (command.length()== 1){
                System.out.printf("%s is character type\n",command);
            }else {
                System.out.printf("%s is string type\n",command);
            }
            command = scanner.nextLine();
        }
    }

}

package Lecture4Methods.exersise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String type = scanner.nextLine();
       dataType(input,type);
    }

    static void dataType (String type ,String b){

        switch (type){
            case "int":
                int num = Integer.parseInt(b);
                num *= 2;
                System.out.println(num);
                break;
            case "real":
                double numD = Double.parseDouble(b);
                numD *= 1.5;
                System.out.printf("%.2f",numD);
                break;
            case "string":
                System.out.printf("$%s$",b);
                break;
        }
    }
}

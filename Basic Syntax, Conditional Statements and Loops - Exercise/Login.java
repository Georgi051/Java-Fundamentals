package Lecture1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String reversedName = "";
        for (int i = userName.length()-1; i >= 0 ; i--) {
            reversedName += userName.charAt(i);
        }
        int counter = 1;
        String command = scanner.nextLine();
        while (!command.equals(reversedName)){

            if (counter++ == 4){
                System.out.printf("User %s blocked!",userName);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            command = scanner.nextLine();
        }
        System.out.printf("User %s logged in.\n",userName);
    }
}

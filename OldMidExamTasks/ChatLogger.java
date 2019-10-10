package ExamsTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chatList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!"end".equals(command)){
            String[] inputData = command.split(" ");
            String typeComand = inputData[0];
            String massage = inputData[1];

            switch (typeComand){
                case "Chat":
                    chatList.add(massage);
                    break;
                case "Delete":
                    if (chatList.contains(massage)){
                        chatList.remove(massage);
                    }
                    break;
                case "Edit":
                    String editVersion = inputData[2];
                    if (chatList.contains(massage)){
                        int ind = chatList.indexOf(massage);
                        chatList.set(ind,editVersion);
                    }
                    break;
                case "Pin":
                    if (chatList.contains(massage)){
                        int indx = chatList.indexOf(massage);
                        String temp = chatList.get(indx);
                        chatList.remove(massage);
                        chatList.add(temp);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < inputData.length; i++) {
                        chatList.add(inputData[i]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (String s : chatList) {
            System.out.println(s);
        }
    }
}

package FinalExam.exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int massageCapacity = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> sendBook = new LinkedHashMap<>();
        Map<String,Integer> recivedBook = new LinkedHashMap<>();


        String command = scanner.nextLine();
        while (!"Statistics".equals(command)){
            String[] input = command.split("=");
            String typeComand = input[0];
            String userName = input[1];

            if (typeComand.equals("Add")){
                int sendMassage = Integer.parseInt(input[2]);
                int recivedMassage = Integer.parseInt(input[3]);
                if (!sendBook.containsKey(userName)){
                    sendBook.put(userName,sendMassage);
                    recivedBook.put(userName,recivedMassage);
                }
            }else if (typeComand.equals("Message")){
                String receiver = input[2];
                if (sendBook.containsKey(userName) && recivedBook.containsKey(receiver)){
                    int sendMassage = sendBook.get(userName);
                    int recevedMassage = recivedBook.get(receiver);

                    sendBook.put(userName,sendBook.get(userName)+1);
                    recivedBook.put(receiver,recivedBook.get(receiver)+ 1);
                    int sMassage = sendBook.get(userName);


                    if (sMassage >= massageCapacity){
                        System.out.printf("%s reached the capacity!\n",userName);
                        sendBook.remove(userName);
                        recivedBook.remove(userName);
                        command = scanner.nextLine();
                        continue;
                    }else {
                        recivedBook.put(receiver,sendMassage  + recevedMassage);
                    }
                    int rMassage = recivedBook.get(receiver);

                    if (rMassage >= massageCapacity){
                        System.out.printf("%s reached the capacity!\n",receiver);
                        recivedBook.remove(receiver);
                        sendBook.remove(receiver);
                    }
                }
            }else {
                if (userName.equals("All")){
                    sendBook.clear();
                    recivedBook.clear();
                }else {
                    if (sendBook.containsKey(userName) && recivedBook.containsKey(userName)){
                        sendBook.remove(userName);
                        recivedBook.remove(userName);
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Users count: %d\n",sendBook.entrySet().size());
       Map<String,Integer> output = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> kvp : recivedBook.entrySet()) {
                int total = 0;

            for (Map.Entry<String, Integer> kvp2 : sendBook.entrySet()) {
                if (kvp.getKey().equals(kvp2.getKey())){
                    if (!output.containsKey(kvp2.getKey())){
                        int reciveMail = kvp.getValue();
                        int sendMail =kvp2.getValue();
                        total = reciveMail + sendMail;
                        output.put(kvp.getKey(),total);
                    }
                }

            }
        }
        recivedBook.entrySet().stream().sorted((f,s)-> {
            int sort = s.getValue().compareTo(f.getValue());
            if (sort == 0){
                sort = f.getKey().compareTo(s.getKey());
            }
            return sort;
        }).forEach(enrty -> {
            System.out.printf("%s - %d\n",enrty.getKey(),output.get(enrty.getKey()));
        });

    }
}

package ExamsTasks.ExamTasks;

import java.util.*;
import java.util.stream.Collectors;

public class ContactList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> contactList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> printContact = new ArrayList<>();
        for (int i = 0; i < contactList.size(); i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String typeComand = inputData[0];

            switch (typeComand){
                case "Add":
                    String contact = inputData[1];
                    int indx = Integer.parseInt(inputData[2]);
                    if (contactList.contains(contact)){
                        if (indx >= 0 && indx < contactList.size()){
                            contactList.add(indx,contact);
                        }
                    }else {
                        contactList.add(contact);
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(inputData[1]);
                    if (index >= 0 && index <= contactList.size()){
                        contactList.remove(index);
                    }
                    break;
                case "Export":
                    int startInx = Integer.parseInt(inputData[1]);
                    int count = Integer.parseInt(inputData[2]);
                    if (startInx >= 0 && startInx < contactList.size()){
                        if (count > contactList.size()){
                            printContact.addAll(contactList.subList(startInx,contactList.size()));
                        }else {
                            printContact.addAll(contactList.subList(startInx,count));
                        }

                    }
                    for (String s : printContact) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    printContact.removeAll(printContact);
                    break;
                case "Print":
                    String type = inputData[1];
                    switch (type){
                        case "Normal":
                            System.out.print("Contacts: ");
                            for (String s : contactList) {
                                System.out.print(s + " ");
                            }
                            return;
                        case "Reversed":
                            Collections.reverse(contactList);
                            System.out.print("Contacts: ");
                            for (String s : contactList) {
                                System.out.print(s + " ");
                            }
                            return;
                    }
                    break;
            }
        }

    }
}

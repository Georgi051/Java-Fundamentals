package OldFinalExamTasks;

import java.util.Scanner;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder currNameAndSong = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String command = scanner.nextLine();
        int current;
        int key;

        while (!"end".equals(command)) {
            String[] data = command.split(":");
            String name = data[0];
            String song = data[1];
            boolean nameValid = false;
            boolean songValid = false;

            if (Character.isUpperCase(name.charAt(0))) {
                for (int i = 1; i < name.length(); i++) {
                    if (!Character.isLowerCase(name.charAt(i)) &&
                            !Character.isWhitespace(name.charAt(i)) && name.charAt(i) != '\'') {
                        nameValid = false;
                        break;
                    }
                    nameValid = true;
                }
            }
            for (int i = 0; i < song.length(); i++) {
                if (!Character.isUpperCase(song.charAt(i)) &&
                        !Character.isWhitespace(song.charAt(i))) {
                    songValid = false;
                    break;
                }
                songValid = true;
            }
            if (nameValid && songValid) {
                currNameAndSong.delete(0, currNameAndSong.length());
                sb.delete(0, sb.length());
                currNameAndSong.append(name);
                currNameAndSong.append('@');
                currNameAndSong.append(song);

                key = name.length();

                for (int i = 0; i < currNameAndSong.length(); i++) {

                    if (Character.isUpperCase(currNameAndSong.charAt(i))) {
                        current = key + currNameAndSong.charAt(i);
                        while (current > 90) {
                            int diff = current - 90;
                            current = diff + 64;
                        }
                        sb.append((char) current);
                    } else if (Character.isLowerCase(currNameAndSong.charAt(i))) {
                        current = key + currNameAndSong.charAt(i);
                        while (current > 122) {
                            int diff = current - 122;
                            current = diff + 96;
                        }
                        sb.append((char) current);
                    } else if (currNameAndSong.charAt(i) == '\'' || currNameAndSong.charAt(i) == '@' ||
                            Character.isWhitespace(currNameAndSong.charAt(i))) {
                        sb.append(currNameAndSong.charAt(i));
                    }
                }
                System.out.printf("Successful encryption: %s\n", sb);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}

package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.Scanner;

public class Articles {

    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",
                    this.title,
                    this.content,
                    this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split(": ");
            String command = data[0];
            String parameter = data[1];

            if (command.equals("Edit")) {
                article.setContent(parameter);
            } else if (command.equals("ChangeAuthor")) {
                article.setAuthor(parameter);
            } else {
                article.setTitle(parameter);
            }

        }
        System.out.println(article);
    }
}

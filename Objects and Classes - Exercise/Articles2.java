package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {

    public static class Article2 {
        private String title;
        private String content;
        private String author;

        public Article2(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
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

        int n = Integer.parseInt(scanner.nextLine());
        List<Article2> article = new ArrayList<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split(", ");

            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article2  article2 = new Article2(title,content,author);

            article.add(article2);

        }
        String criteria = scanner.nextLine();

        if (criteria.equals("title")){
            article.sort((f , s) -> f.getTitle().compareTo(s.getTitle()));
        }else if (criteria.equals("content")){
            article.sort((f , s) -> f.getContent().compareTo(s.getContent()));
        }else {
            article.sort((f , s) -> f.getAuthor().compareTo(s.getAuthor()));
        }

        for (Article2 article2 : article) {
            System.out.println(article2.toString());
        }
    }
}

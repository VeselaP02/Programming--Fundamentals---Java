package Articles;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String [] articleParts = command.split(", ");

        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        int countRows = Integer.parseInt(scanner.nextLine());
        Article article = new Article(title,content,author);

        for (int rows = 1; rows <= countRows ; rows++) {
            String input = scanner.nextLine();

            if (input.contains("Edit")){
                String newContent = input.split(": ")[1];
                article.edit(newContent);
            } else if (input.contains("ChangeAuthor")) {
                String newAuthor = input.split(": ")[1];
                article.ChangeAuthor(newAuthor);
            } else if (input.contains("Rename")) {
                String newTitle = input.split(": ")[1];
                article.rename(newTitle);
            }
        }
        System.out.println(article.toString());
    }
}

package Regular_Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> booksList = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String [] booksName = command.split(" \\| ");
            if(command.contains("Add Book")){
                String nameBook = booksName[1];
                if (!booksList.contains(nameBook)) {
                    booksList.add(0, nameBook);
                }
            } else if (command.contains("Take Book")) {
                String nameBook = booksName[1];
                if (booksList.contains(nameBook)){
                    booksList.remove(nameBook);
                }
            } else if (command.contains("Swap Books")) {
                String firstBook = booksName[1];
                String secondBook = booksName[2];

                int firstIndex = 0;
                int secondIndex = 0;
                for (int i = 0; i < booksList.size() ; i++) {
                    if (booksList.get(i).equals(firstBook)){
                        firstIndex = i;
                    }
                    if (booksList.get(i).equals(secondBook)){
                        secondIndex = i;
                    }

                }

                    booksList.set(firstIndex,secondBook);
                    booksList.set(secondIndex,firstBook);

            } else if (command.contains("Insert Book")) {
                String insertBook = booksName[1];
                if (!booksList.contains(insertBook)){
                    booksList.add(insertBook);
                }
            } else if (command.contains("Check Book")) {
                int index = Integer.parseInt(booksName[1]);
                if (index >= 0 && index <= booksList.size() ){
                    System.out.println(booksList.get(index));
                }
            }


            command = scanner.nextLine();
        }

        for (int i = 0; i <booksList.size() ; i++) {
            String item = booksList.get(i);
            if (i < booksList.size() - 1){
                System.out.print(item + ", ");
            } else {
                System.out.print(item);
            }
        }
    }
}

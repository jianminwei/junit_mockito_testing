package bookstoread;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    List <String> books = new ArrayList<>();

    public List<String> books() {
        return books;
    }

    public void add(String book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}' + books.size() + " books found";
    }
}

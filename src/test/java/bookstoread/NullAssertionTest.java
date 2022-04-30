package bookstoread;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NullAssertionTest {
    @Test
    public void shelfToStringShouldPrintBookCountAndTitles() throws Exception {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        shelf.add("The Phoenix Project");
        shelf.add("Java 8 in Action");
        String shelfStr = shelf.toString();
        assertTrue(shelfStr.contains("The Phoenix Project"), "1st book title missing");
        assertTrue(shelfStr.contains("Java 8 in Action") , "2nd book title missing ");
        assertTrue(shelfStr.contains("2 books found"), "Book count missing");
    }
}

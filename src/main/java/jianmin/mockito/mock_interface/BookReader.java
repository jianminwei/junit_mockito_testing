package jianmin.mockito.mock_interface;

public class BookReader {
    Book book;
    public BookReader(Book book) {
        this.book = book;
    }

    public String getContent() {
        return book.bookContent();
    }

}

package jianmin.mockito.mock_interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookReaderAnnotationWithExtensionTest {

    @Mock
    private Book mockedBook;

    private BookReader reader;

    @BeforeEach
    void setUp() {
        reader = new BookReader(mockedBook);
    }

    @Test
    void testGetContent() {
        when(mockedBook.bookContent()).thenReturn("Mockito", "Another Mockito", "Third Mockito");
        assertEquals("Mockito", reader.getContent());
        assertEquals("Another Mockito", reader.getContent());
        assertEquals("Third Mockito", reader.getContent());
    }
}
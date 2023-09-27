package test.java.com.company.Lab1.task14;

import main.java.com.company.Lab1.task15.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testCompareTo() {
        Book firstBook = new Book("", "", 12, 2);
        Book secondBook = new Book("", "", 12, 4);
        Book thirdBook = new Book("", "", 12, 1);
        Book fourthBook = new Book("", "", 12, 17);
        ArrayList<Book> bookArrayList = new ArrayList<>(Arrays.asList(firstBook, secondBook, thirdBook, fourthBook));
        Collections.sort(bookArrayList);
        ArrayList<Book> expected = new ArrayList<>(Arrays.asList(thirdBook, firstBook, secondBook, fourthBook));
        assertEquals(expected, bookArrayList);
    }

    @Test
    void testClone() {
        Book book = new Book("Title", "Author", 12, 2);
        Book newBook = book.clone();
        assertEquals(book.getAuthor(),newBook.getAuthor());
        assertEquals(book.getTitle(), newBook.getTitle());
        assertEquals(book.getPrice(), newBook.getPrice());
        assertEquals(book.getIsbn(), newBook.getIsbn());
    }
}
package test.java.com.company.Lab1.task16;

import main.java.com.company.Lab1.task15.Book;
import main.java.com.company.Lab1.task16.AuthorTitleComparator;
import main.java.com.company.Lab1.task16.AuthorTitlePriceComparator;
import main.java.com.company.Lab1.task16.TitleAuthorComparator;
import main.java.com.company.Lab1.task16.TitleComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testTitleComparatorCompareTo() {
        Book firstBook = new Book("A", "C", 4, 2);
        Book secondBook = new Book("C", "D", 1, 4);
        Book thirdBook = new Book("E", "E", 2, 1);
        Book fourthBook = new Book("D", "A", 3, 17);
        ArrayList<Book> bookArrayList = new ArrayList<>(Arrays.asList(firstBook, secondBook, thirdBook, fourthBook));
        bookArrayList.sort(new TitleComparator());
        ArrayList<Book> expected = new ArrayList<>(Arrays.asList(firstBook, secondBook, fourthBook, thirdBook));
        assertEquals(expected, bookArrayList);
    }
    @Test
    void testTitleAuthorComparatorCompareTo() {
        Book firstBook = new Book("A", "C", 4, 2);
        Book secondBook = new Book("C", "D", 1, 4);
        Book thirdBook = new Book("E", "E", 2, 1);
        Book fourthBook = new Book("A", "A", 3, 17);
        ArrayList<Book> bookArrayList = new ArrayList<>(Arrays.asList(firstBook, secondBook, thirdBook, fourthBook));
        bookArrayList.sort(new TitleAuthorComparator());
        ArrayList<Book> expected = new ArrayList<>(Arrays.asList(fourthBook, firstBook, secondBook, thirdBook));
        assertEquals(expected, bookArrayList);
    }
    @Test
    void testAuthorTitleComparatorCompareTo() {
        Book firstBook = new Book("A", "C", 4, 2);
        Book secondBook = new Book("C", "D", 1, 4);
        Book thirdBook = new Book("E", "C", 2, 1);
        Book fourthBook = new Book("D", "A", 3, 17);
        ArrayList<Book> bookArrayList = new ArrayList<>(Arrays.asList(firstBook, secondBook, thirdBook, fourthBook));
        bookArrayList.sort(new AuthorTitleComparator());
        ArrayList<Book> expected = new ArrayList<>(Arrays.asList(fourthBook, firstBook, thirdBook, secondBook));
        assertEquals(expected, bookArrayList);
    }
    @Test
    void testAuthorTitlePriceComparatorCompareTo() {
        Book firstBook = new Book("A", "C", 4, 2);
        Book secondBook = new Book("A", "C", 1, 4);
        Book thirdBook = new Book("E", "E", 2, 1);
        Book fourthBook = new Book("D", "A", 3, 17);
        ArrayList<Book> bookArrayList = new ArrayList<>(Arrays.asList(firstBook, secondBook, thirdBook, fourthBook));
        bookArrayList.sort(new AuthorTitlePriceComparator());
        ArrayList<Book> expected = new ArrayList<>(Arrays.asList(fourthBook, secondBook, firstBook, thirdBook));
        assertEquals(expected, bookArrayList);
    }

}
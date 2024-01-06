package TestClassesTest;

import TestClasses.Book;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookConstructorAndGetters() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertTrue(book.isAvailable());
    }

    @Test
    public void testSetAvailable() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");

        assertTrue(book.isAvailable());
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }

    // Add more test cases based on your requirements and possible scenarios

    @Test
    public void testBookEquality() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Animal Farm", "George Orwell");

        assertEquals(book1.getTitle(), book2.getTitle());
        assertNotEquals(book1, book3);
        assertNotEquals(book2, book3);
    }
}

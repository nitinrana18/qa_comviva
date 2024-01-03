package TestClassesTest;

import TestClasses.Book;
import TestClasses.LibraryCatalog;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LibraryCatalogTest {

    @Test
    public void testAddBookAndGetBooks() {
        LibraryCatalog library = new LibraryCatalog();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        List<Book> books = library.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }

    @Test
    public void testBorrowBook() {
        LibraryCatalog library = new LibraryCatalog();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook("The Catcher in the Rye");
        assertFalse(book1.isAvailable());
        assertTrue(book2.isAvailable());
    }

    @Test
    public void testReturnBook() {
        LibraryCatalog library = new LibraryCatalog();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");

        library.addBook(book1);
        library.borrowBook("The Catcher in the Rye");
        assertFalse(book1.isAvailable());

        library.returnBook("The Catcher in the Rye");
        assertTrue(book1.isAvailable());
    }

}
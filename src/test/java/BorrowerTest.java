import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    
    private Borrower borrower;
    private Book book;
    private Library library;
    
    @Before
    public void before(){
        borrower = new Borrower("Johnny Briggs");
        book = new Book ();
        library = new Library(5);
        library.addBook(book);
    }
    
    @Test
    public void borrowerHasEmptyCollection(){
        assertEquals(0,borrower.BookCount());
    }
    
    @Test
    public void borrowerCanBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.BookCount());
    }
}

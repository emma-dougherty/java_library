import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    
    private Library library;
    private Book book;
    
    @Before
    public void before(){
        library = new Library(5);
        book = new Book();
    }
    
    @Test
    public void libraryCanCountStock(){
        assertEquals(0, library.countStock());
    }
    
    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        assertEquals(1, library.countStock());
    }
    
    public void libraryCanRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.countStock());
    }
    
    @Test
    public void libraryCannotAddBookIfFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countStock());
    }
}

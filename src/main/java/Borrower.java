import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;
    
    public Borrower (String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }
    
    public int BookCount() {
        return this.collection.size();
    }
    
    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }
}

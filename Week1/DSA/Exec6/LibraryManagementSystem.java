package Exec6;
import java.util.ArrayList;

public class LibraryManagementSystem {
    private ArrayList<Book> books;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public Book searchBookByTitleLinear(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
  
    public Book searchBookByTitleBinary(String title) {
        int low = 0;
        int high = books.size() - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = books.get(mid);
            int comparison = title.compareToIgnoreCase(midBook.getTitle());

            if (comparison == 0) {
                return midBook; 
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return null; 
    }
    
    
    public void sortBooksByTitle() {
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        
        lms.addBook(new Book("B001", "Effective Java", "Joshua Bloch"));
        lms.addBook(new Book("B002", "Introduction to Algorithms", "Thomas H. Cormen"));
        lms.addBook(new Book("B003", "Clean Code", "Robert C. Martin"));
        
    
        Book foundBook = lms.searchBookByTitleLinear("Clean Code");
        System.out.println("Linear Search Result: " + (foundBook != null ? foundBook : "Book not found"));
        
       
        lms.sortBooksByTitle();
        
       
        foundBook = lms.searchBookByTitleBinary("Effective Java");
        System.out.println("Binary Search Result: " + (foundBook != null ? foundBook : "Book not found"));
    }
}

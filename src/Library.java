import Library.Book.Book;
import Library.Patron.Patron;
import Library.Transaction.ETransactionType;
import Library.Transaction.Transaction;

import java.util.*;

public class Library {
    private List<Book> allbooks;
    private List<Patron> patrons;
    private List<Book> borrowed ;

    public Library() {
        this.allbooks = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.borrowed = new ArrayList<>();
    }

    public void addBook(Book book){
        this.allbooks.add(book);
    }
    public void removeOldBook(Book book){
        this.allbooks.remove(book);
    }

    public void addNewPatron(Patron patron){
        this.patrons.add(patron);
    }

    public void removePatron(Patron patron){
        this.patrons.remove(patron);
    }

    public void borrowBook(Book book,Patron patron){
        this.allbooks.remove(book);
        patron.borrowBook(book, new Transaction(
                UUID.randomUUID(),patron.getId(),new Date(),book.getBookId(),new Date(2023, Calendar.JANUARY,1), ETransactionType.ISSUE
        ));
    }
    public void returnBook(Book book,Patron patron){
        this.borrowed.remove(book);
        patron.returnook(book, new Transaction(
                UUID.randomUUID(),patron.getId(),new Date(),book.getBookId(),new Date(2023, Calendar.JANUARY,1), ETransactionType.RETRUN
        ));
    }
    public Optional<Book> findBookByTitle(String title) {
        return allbooks.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    public Optional<Book> findBookById(int id) {
        return allbooks.stream()
                .filter(book -> book.getBookId()==id)
                .findFirst();
    }

    public Optional<Book> findBookByISBN(String isbn) {
        return allbooks.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();
    }

    public boolean isBookAvailable(Book book) {
        return this.allbooks.stream().anyMatch(b->b.getBookId() == book.getBookId());
    }
}

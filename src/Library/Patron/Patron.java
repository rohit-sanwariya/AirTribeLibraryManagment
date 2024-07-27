package Library.Patron;

import Library.Book.Book;
import Library.Transaction.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patron {
    private int id;
    private String name;
    private String email;
    private String address;
    private Date joiningdate;
    private List<Book> books;
    private List<Transaction> transactions;

    public Patron(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.joiningdate = new Date();
        this.books = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }







    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoiningdate() {
        return joiningdate;
    }

    public void setJoiningdate(Date joiningdate) {
        this.joiningdate = joiningdate;
    }

    public void borrowBook(Book book,Transaction transaction){
        this.books.add(book);
        this.transactions.add(transaction);
    }
    public void returnook(Book book,Transaction transaction){
        this.books.remove(book);
    }

}

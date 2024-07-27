package Library.Book;

public class Book {
    private String title;
    private String isbn;
    private int year;
    private String author;
    private int bookId;



    public Book(String title, String isbn, int year, String author, int bookId) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.author = author;
        this.bookId = bookId;
    }

    public Book(String title, String isbn, int year, String author) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


}


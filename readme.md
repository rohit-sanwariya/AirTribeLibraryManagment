# Library Management System

## Overview

This is a simple Library Management System implemented in Java. It allows for the management of books and patrons, including adding, removing, borrowing, and returning books. The system also supports searching for books by title, ID, and ISBN.

## Classes

### Library

The `Library` class manages a collection of books and patrons. It provides methods to add and remove books and patrons, as well as to borrow and return books. The class also includes methods to find books by their title, ID, and ISBN, and to check if a book is available.

### Book

The `Book` class represents a book in the library. It contains fields for the book's title, ISBN, year of publication, author, and a unique book ID.

### Patron

The `Patron` class represents a library patron. It includes fields for the patron's ID, name, email, address, joining date, a list of borrowed books, and a list of transactions.

### Transaction

The `Transaction` class represents a transaction in the library, such as borrowing or returning a book. It includes fields for the transaction ID, member ID, date, book ID, due date, and transaction type.

## Usage

### Adding a Book

To add a book to the library:

```java
Library library = new Library();
Book book = new Book("Book Title", "1234567890", 2020, "Author Name", "1");
library.addBook(book);
```
### Removing a Book
To remove a book from the library:
```java
library.removeOldBook(book);
```

### Adding a Patron
To add a new patron:
```java
Patron patron = new Patron(1, "John Doe", "john.doe@example.com", "123 Main St", new Date());
library.addNewPatron(patron);
```

### Removing a Patron
To remove a patron:
```java
library.borrowBook(book, patron);
```


### Borrowing a Book
To borrow a book:
```java
library.borrowBook(book, patron);
```

### Returning a Book
To return a book:
```java
library.returnBook(book, patron);
```


### Finding a Book
To find a book by title:
```java
Optional<Book> foundBook = library.findBookByTitle("Book Title");
foundBook.ifPresent(book -> System.out.println("Found by title: " + book));

```
### Finding a Book
To find a book by ID:
```java
Optional<Book> foundBook = library.findBookById(1);
foundBook.ifPresent(book -> System.out.println("Found by ID: " + book));


```

### Checking Book Availability
To check if a book is available:
```java
boolean isAvailable = library.isBookAvailable(book);
System.out.println("Is book available: " + isAvailable);


```































[![A mushroom-head robot](src/library_class_diagram.png 'Codey the Codecademy mascot')](https://codecademy.com)
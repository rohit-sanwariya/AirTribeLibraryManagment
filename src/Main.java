import Library.Book.Book;
import Library.Patron.Patron;

public class Main {
    public static void main(String[] args) {
            Library library = new Library();

            Book theSubtleArtOfNotGiving = new Book("The Subtle Art of Not Giving a F*ck","978-0-06-245771-4",2016,"Mark Ronson",1);

            // update
            theSubtleArtOfNotGiving.setTitle("the subtle art of not giving a f*ck");

            // add a new book
            library.addBook(theSubtleArtOfNotGiving);
            Patron jered =   new Patron(
                    1,"jered kushner","jered@outlook.com","jered kushner"
            );
            library.addNewPatron(
                  jered
            );



            if(library.isBookAvailable(theSubtleArtOfNotGiving)){
                    library.borrowBook(theSubtleArtOfNotGiving,jered);
            }
            System.out.println(library.isBookAvailable(theSubtleArtOfNotGiving));

            // return book
            library.returnBook(theSubtleArtOfNotGiving,jered);
            System.out.println(library.isBookAvailable(theSubtleArtOfNotGiving));

            // remove patron
            library.removePatron(jered);

    }
}
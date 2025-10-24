import java.util.ArrayList;


class Book {

    private String title;
    private String author;
    private String isbn;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}


class Library {
    private ArrayList<Book> books = new ArrayList<>();

    
    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Book added: " + book.getTitle());
    }


    public void removeBook(String title) {
        boolean removed = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println(" Book removed: " + title);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(" Book not found: " + title);
        }
    }

    
    public void displayAllBooks() {
        System.out.println("\nList of Books:");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}


 class Books {
    public static void main(String[] args) {
        // Create Library object
        Library library = new Library();

        // Create Book objects
        Book book1 = new Book("MARVEL", "Harper Lee", "9780061120084");
        Book book2 = new Book("DC SUPER HEROES", "George Orwell", "9780451524935");
        Book book3 = new Book("F1", "F. Scott Fitzgerald", "9780743273565");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayAllBooks();

        // Remove one book
        library.removeBook("1984");

        // Display updated list
        library.displayAllBooks();
    }
}
 
    


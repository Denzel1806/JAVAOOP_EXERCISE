import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book.getTitle() + " has been removed from the library.");
        } else {
            System.out.println("Book not found in the library.");
        }

    public void displayLibrary() {
        System.out.println("\nLibrary Collection:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}

class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Data Structures", "Mark Allen");

        
        library.addBook(b1);
        library.addBook(b2);

        
        library.displayLibrary();


        library.removeBook(b1);

    
        library.displayLibrary();
    }
}
 
    


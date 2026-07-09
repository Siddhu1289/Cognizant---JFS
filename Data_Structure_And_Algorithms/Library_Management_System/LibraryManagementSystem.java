public class LibraryManagementSystem {

    private Book[] books = new Book[10];
    private int count = 0;

    // Add Book
    public void addBook(Book book) {

        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book Added Successfully.");
        } else {
            System.out.println("Library is Full.");
        }

    }

    // Linear Search
    public Book linearSearch(int id) {

        for (int i = 0; i < count; i++) {

            if (books[i].getBookId() == id) {
                return books[i];
            }

        }

        return null;
    }

    // Display Books
    public void displayBooks() {

        System.out.println("\nLibrary Books");

        for (int i = 0; i < count; i++) {
            books[i].display();
        }

    }

    public static void main(String[] args) {

        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Data Structures", "Mark Allen"));
        library.addBook(new Book(103, "Design Patterns", "Erich Gamma"));

        library.displayBooks();

        System.out.println("\nSearching for Book ID 102");

        Book book = library.linearSearch(102);

        if (book != null) {
            System.out.println("Book Found:");
            book.display();
        } else {
            System.out.println("Book Not Found");
        }
    }
}
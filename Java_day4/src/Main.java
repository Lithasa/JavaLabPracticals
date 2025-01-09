
public class Main {
    public static void main(String args[]) {
        Library library = new Library(10, 5);

        // Adding books
        library.addBook(new Book(1, "Harry Potter", "Mr. Harry", 1500, 10));
        library.addBook(new Book(2, "Percy Jackson", "Mr. Percy", 1250, 5));
        library.addBook(new Book(3, "Bridgerton", "Mr. Bridgerton", 2000, 7));

        // Adding users
        library.addUser(new User(1, "User1"));
        library.addUser(new User(2, "User2"));

        // Display books and users
        library.displayBooks();
        library.displayUsers();

        // Borrow books
        library.borrowBook(1, 1); // User1 borrows Harry Potter
        library.borrowBook(2, 2); // User2 borrows Percy Jackson

        // Display updated books and users
        library.displayBooks();
        library.displayUsers();

        // Return a book
        library.returnBook(1, 1); // User1 returns Harry Potter

        // Display updated books and users
        library.displayBooks();
        library.displayUsers();
    }
}

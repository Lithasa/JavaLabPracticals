
public class Library {
    private Book[] books;
    private User[] users;
    private int bookIndex;
    private int userIndex;

    public Library(int maxBooks, int maxUsers) {
        books = new Book[maxBooks];
        users = new User[maxUsers];
        bookIndex = 0;
        userIndex = 0;
    }

    
    public void addBook(Book b1) {
        if (bookIndex < books.length) {
            books[bookIndex++] = b1;
            System.out.println("Book added: " + b1);
        } else {
            System.out.println("Library book storage is full.");
        }
    }

    public void addUser(User u1) {
        if (userIndex < users.length) {
            users[userIndex++] = u1;
            System.out.println("User registered: " + u1);
        } else {
            System.out.println("Library user storage is full.");
        }
    }

    private Book findBook(int bookId) {
        for (int i = 0; i < bookIndex; i++) {
            if (books[i].getBookId() == bookId) {
                return books[i];
            }
        }
        return null;
    }

    private User findUser(int userId) {
        for (int i = 0; i < userIndex; i++) {
            if (users[i].getUserId() == userId) {
                return users[i];
            }
        }
        return null;
    }

    public void borrowBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (book.getStockQuantity() > 0 && user.getBorrowedBooksCount() < 5) {
            book.setStockQuantity(book.getStockQuantity() - 1);
            user.setBorrowedBooksCount(user.getBorrowedBooksCount() + 1);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Borrowing the book failed: either stock is empty or user has reached borrowing limit.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (user.getBorrowedBooksCount() > 0) {
            book.setStockQuantity(book.getStockQuantity() + 1);
            user.setBorrowedBooksCount(user.getBorrowedBooksCount() - 1);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Returning the book failed: user has not borrowed any books.");
        }
    }



    
    
    
    
    
}

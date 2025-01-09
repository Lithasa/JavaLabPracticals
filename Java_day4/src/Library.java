
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
    
    public void borrowBook(Book b1, User u1){
        if(b1 != null && u1 != null){
            int updateStock = b1.getStockQuantity() -1;
            if(updateStock >= 0 ){
                b1.setStockQuantity(updateStock);
                u1.setBorrowedBooksCount(u1.getBorrowedBooksCount()+1);
                System.out.println(u1.getName() + " borrowed " + b1.getTitle())
                        
            } 
            else{
                System.out.println("Insufficient stock");
            }
            
        }
    }


    
    
    
    
    
}

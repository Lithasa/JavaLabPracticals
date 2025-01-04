
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

    
    public void addBook(Book b1){
        for(int i = 0; i< books.length; i++){
            if(books[i]== null){
                books[i] = b1;
                return;
            }
        }
        System.out.println("Library is full.");
        
    }
    public void addUser(User u1){
        for(int i = 0; i< users.length; i++){
            if(users[i]== null){
                users[i] = u1;
                return;
            }
        }
        System.out.println("Library is full");
        
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


public class Library {
    
    private  Book[] books;
    private  User[] users;
    
    public Library(){
        books = new Book[20];
        users = new User[20];
    }
    
    public void addBook(Book b1){
        for(int i = 0; i< books.length; i++){
            if(books[i]== null){
                books[i] = b1;
                return;
            }
        }
        System.out.println("Library is full");
        
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

    
    
    
    
    
    
}

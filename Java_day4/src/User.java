
public class User {
    private int userId;
    private String name;
    private int borrowedBooksCount = 0; 
    static int bookCount;

User(int userId, String name, int borrowedBooksCount){
    this.userId = userId;
    this.name = name;
    this.borrowedBooksCount = borrowedBooksCount;
    bookCount++;
}

    User(int i, String u2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int getUserId(){
    return userId;
}
public void setUserId(int userId){
    this.userId = userId;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public int getBorrowedBooksCount(){
    return borrowedBooksCount;
}
public void setBorrowedBooksCount(int borrowedBooksCount){
    this.borrowedBooksCount = borrowedBooksCount;
}



}
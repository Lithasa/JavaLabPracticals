
public class Book {
    private int bookId;
    private String title;
    private String author;
    private int price;
    private int stockQuantity;
    static int bookCount;
    
    Book(int bookId,String title, String author,int price,int stockQuantity){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
        bookCount++;
    }
    
    public int getBookId(){
        return bookId;   
}
    public void setBookId(int bookId){
        this.bookId = bookId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity = stockQuantity;
    }
    
            
    
}

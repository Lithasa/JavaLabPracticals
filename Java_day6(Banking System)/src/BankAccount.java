
public class BankAccount {
    
    private double balance;
    
    public double getBalance(){
        return balance;      
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void widrawFunds(double amount){
        
        if(balance > 500){
            balance = balance - amount;
        }
        else{
            System.out.println("Declined due to unsuffiecent balance");
        }
        
    }
    public void depositFunds(double amount){
        
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Bank Balance : " + balance);
        }else{
            System.out.println("Transaction cant be done....");
        }
        
    }
    public void monthlyUpdate(){
         
    }
}

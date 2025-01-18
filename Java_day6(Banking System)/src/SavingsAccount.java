
public class SavingsAccount extends BankAccount {        
    
    private double interestRate;
    
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    
    @Override
    public void monthlyUpdate(){
        super.setBalance(super.getBalance()+super.getBalance()* (interestRate/100));
        
    }
}

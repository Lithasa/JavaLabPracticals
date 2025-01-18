
public class SeniorAccount extends SavingsAccount {
    
    private double allowance;
    
    public double getAllowance(){
        return allowance;
    }
    public void setAllowance(double allowance){
        this.allowance = allowance;
    }
    
    @Override
    public void depositFunds(double amount){
        if(amount >0){
            super.setBalance(super.getBalance() + amount+ allowance);
        }
    }
            
    
    
}

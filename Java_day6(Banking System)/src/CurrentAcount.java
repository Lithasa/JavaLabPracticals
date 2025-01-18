
public class CurrentAcount extends BankAccount{
    
    private double minimumBalance;
    private double penalty;
    
    public double getMinimumBalance(){
        return minimumBalance;
    }
    public void setMinimumBalance(double amount){
        this.minimumBalance = minimumBalance;
    }
    public double getPanelty(){
        return penalty;
    }
    public void setPanelty(double penalty){
        this.penalty = penalty;
    }
    
    @Override
    public void monthlyUpdate(){
        if(super.getBalance() < minimumBalance ){
            super.setBalance(super.getBalance()- penalty);
        }
    }
    
}

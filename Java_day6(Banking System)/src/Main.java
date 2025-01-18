
public class Main {
    
    public static void main(String args[]){
        
        BankAccount acc1 = new BankAccount();
        acc1.depositFunds(1000);
        acc1.getBalance();

        SavingsAccount acc2 = new SavingsAccount();
        acc2.depositFunds(10000);
        acc2.depositFunds(2500);
        acc2.getBalance();
        acc2.setInterestRate(20);
        acc2.monthlyUpdate();


    }
    
}

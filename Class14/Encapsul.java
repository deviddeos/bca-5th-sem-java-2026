class Bank{
    private String accountHolder;
    private double balance;

    public Bank(String holderName, double amount) {
        if (amount > 0) {
            balance = amount;
        }
        accountHolder = holderName;
    }

    public void getHolderName() {
        System.out.println("Account Holder name: "+accountHolder);
    }
    public void getBalance() {
        System.out.println("Total balance is : "+balance);
    }
    
    public void setBalance(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
}

public class Encapsul {
    public static void main(String[] args) {
        Bank obj = new Bank("Bob", 1000);
       obj.getHolderName();
       obj.getBalance();
       obj.setBalance(2000);
       obj.getBalance();
    }
}

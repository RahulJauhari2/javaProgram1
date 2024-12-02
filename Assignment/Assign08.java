public class Assign08 {
    
}

class Account{
    private int accountNumber ,balance ;
    String customerName ;
    private static int rateOfIntrest ;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName= customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public static double  getRateofIntrest(){
        return 3.5;
    }
}
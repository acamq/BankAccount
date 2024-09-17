public class BankAccount
{
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;

    public BankAccount(String name, int accountNum, double balance, String password)
    {
        this.name=name;
        this.accountNum=accountNum;
        this.balance=balance;
        this.password=password;
    }
    public boolean login(String username, String password)
    {
        if(username.equals(this.name) && password.equals(this.password)){
            loggedIn=true;
            return true;
        }
        else{
            return false;
        }

    }
    public double getBalance()
    {
        if (loggedIn == true){
            return balance;
        }
        else{
            throw new IllegalStateException("Not logged in.");
        }
    }
    public double deposit(double depositAmount)
    {
        if (loggedIn==true){
            this.balance+=depositAmount;
            return balance;
        }
        else{
            throw new IllegalStateException("Not logged in.");
        }
    }
    public double withdraw(double withdrawAmount)
    {
        if (loggedIn==true){
            this.balance-=withdrawAmount;
            
        }
        else{
            throw new IllegalStateException("Not logged in.");
        }
    }
    public String toString()
    {
        if (loggedIn==false)
        {
            return "Account Number: " + this.accountNum;

        }
        else{
            return "Account Number: " + this.accountNum + ", balance: " + this.balance; 
        }
    }
    public boolean logout()
    {
        loggedIn = false
        return false
    }
}
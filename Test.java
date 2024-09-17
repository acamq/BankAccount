public class Test
{
    public static void main(String[] args ){
        BankAccount savings = new BankAccount("mesge",12000,100.00,"pass");
        savings.login("mesge", "pass");
        System.out.println(savings.getBalance());
        savings.deposit(100);
        savings.withdraw(53.2);
    
        System.out.println(savings.getBalance());
        System.out.println(savings.toString());
        savings.logout();
    }
}
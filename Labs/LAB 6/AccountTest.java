public class AccountTest{

    public static void main(String[] args){
        
        Account account1 = new Account("1902MEX", "Mohamad-Mario", -900.0);
        Account account2 = new Account("9844LI", "Keith Power", 1500.0);

        System.out.println("The balance of account 1 is: " + account1.getBalance() + "$");
        System.out.println("The balance of account 2 is: " + account1.getBalance() + "$");

        account1.processDeposit(2000.0);
        account2.processCheck(1500.0);

        System.out.println("The new balance of account 1 is: " + account1.getBalance() + "$");
        System.out.println("The new balance of account 2 is: " + account2.getBalance() + "$");
    }
}
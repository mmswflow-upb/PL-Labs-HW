public class Account{

    private String accountNumber;
    private String accountHolder;
    private Double balance;

    public Account(String accNum, String holderName, Double bal){

        this.accountHolder = holderName;
        this.balance = bal;
        this.accountNumber = accNum;
    }

    public Double getBalance(){

        return this.balance;
    }
    public void setBalance(Double newBal){

        this.balance = newBal;
    }

    public void processDeposit(Double amount){

        this.balance += amount;
    }
    public void processCheck(Double amount){

        if (this.balance < 10000){

            this.balance =- amount -15;
            return;
        }
        this.balance =- amount;
    }
}
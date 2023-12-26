package Class;

public class Bank {
    private String bankId;
    private String mobileNumber;
    private double balance;


    public Bank(String bankId, String mobileNumber, double balance) {
        this.bankId = bankId;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }
    public Bank(){}

    public String getBankId() {
        return bankId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void print() {
        System.out.println("Bank ID: " + bankId + "\n" +  "Mobile Number: " + mobileNumber + "\n" +"Balance: " + balance);
    }


}

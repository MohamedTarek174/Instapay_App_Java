package Class;
public class Wallet {
    private String mobileNumber;
    private double balance;
    private IWalletProvider walletProv;
    private WalletProvider walletProvider;

    public Wallet(String mobileNumber, double balance, String typeOfProvider) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;

        // IWalletProvider iWalletProvider = new IWalletProvider();
        // walletProvider = iWalletProvider.getProvider(typeOfProvider);

    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    public WalletProvider getWalletProv() {
        return walletProvider;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWalletProv(WalletProvider walletProv) {
        this.walletProvider = walletProv;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void print() {
        System.out.println("Mobile Number: " + mobileNumber + "\n" + "Balance: " + balance + "\n" + "Wallet Provider: " + walletProv);
    }
}

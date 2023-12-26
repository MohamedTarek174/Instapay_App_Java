package Class;

public class WalletAcc extends Account {
    private Wallet walletAcc;
    public MobileVerification mobileVerified;


    public WalletAcc(Wallet walletAcc) {
        this.walletAcc = walletAcc;
        this.type = "Wallet";

        // mobileVerified = new MobileVerification();
        // mobileVerified.verify(walletAcc.getMobileNumber());     // Check the mobile number

        // walletAcc.getWalletProv().IsExist(walletAcc.getMobileNumber());    // Check if the mobile number is exist in the provider

        // if (walletAcc.getWalletProv().isExist()) {    

        //     if (mobileVerified.isVerified()) {                                        // Check if the mobile number is verified
        //         System.out.println("Your Wallet Account has been created successfully!");
        //     } else {
        //         walletAcc = null;
        //         mobileVerified = null;
        //         System.out.println("Your Wallet Account has not been created because your mobile number is not verified!");
        //     }
        // } else {
        //     walletAcc = null;
        //     System.out.println("Your Wallet Account has not been created because your mobile number is not exist in the provider!");
        // }


    }

    public Wallet getWalletAcc() {
        return walletAcc;
    }

    public MobileVerification getMobileVerified() {
        return mobileVerified;
    }

    public void setWalletAcc(Wallet walletAcc) {
        this.walletAcc = walletAcc;
    }

    public void setMobileVerified(MobileVerification mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public void deductBalance(double amount) {
        walletAcc.deductBalance(amount);
    }

    public void addBalance(double amount) {
        walletAcc.addBalance(amount);
    }

    public void print() {
        walletAcc.print();
    }

    public String checker() {
        return walletAcc.getMobileNumber();
    }

    @Override
    public Wallet GetWallet() {
        return getWalletAcc();
    }

    public double getBalance() {
        return walletAcc.getBalance();
    }
    // public void Verify(){}


}

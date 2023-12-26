package Class;

public class BankCompany extends WalletProvider {

    public Wallet IsExist(String mobileNumber) {
        System.out.println("Checking if the number exists in the BankCompany Wallet provider...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");

        setExist(true);
        Wallet wallet = new Wallet(mobileNumber, 20000, "Bank");

        return wallet;
    }
}

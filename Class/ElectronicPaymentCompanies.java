package Class;

public class ElectronicPaymentCompanies extends WalletProvider {

    public Wallet IsExist(String mobileNumber) {
        System.out.println("Checking if the number exists in the ElectronicPaymentCompanies Wallet provider...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");

        setExist(true);
        Wallet wallet = new Wallet(mobileNumber, 20000, "ElectronicPaymentCompanies");

        return wallet;
    }

}

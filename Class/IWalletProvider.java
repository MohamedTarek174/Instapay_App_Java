package Class;
public class IWalletProvider {

    public WalletProvider getProvider(String typeOfProvider) {
        if (typeOfProvider.equals("bank")) {
            return new BankCompany();
        }else if (typeOfProvider.equals("telecommunication")) {
            return new TelecommunicationCompany();
        }else if (typeOfProvider.equals("electronicPayment")) {
            return new ElectronicPaymentCompanies();

        }else{
            System.out.println("Invalid type of provider!");
            return null;
        }
    }
}

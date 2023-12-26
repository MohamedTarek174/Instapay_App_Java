package Class;


public class WalletMenu implements Menu {
    @Override
    public String getType() {
        return "Wallet";
    }
    @Override
    public int displayMenu() {
        System.out.println("Wallet Menu");
        System.out.println("2. Transfer to insta account");
        System.out.println("3. Transfer to wallet");
        System.out.println("4. Pay Bills");
        System.out.println("5. Check Balance");
        System.out.println("6. Sign Out");
        System.out.println("7. Exit");
        return Choice.nextInt();
    }


}

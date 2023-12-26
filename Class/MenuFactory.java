package Class;

public class MenuFactory implements IMenuFactory {
    public Menu getMenu(String menuType) {

        if (menuType.equals("Bank")) {
            return new BankMenu();
        } else if (menuType.equals("Wallet")) {
            return new WalletMenu();
        }else if (menuType.equals("Guest")) {
            return new GuestMenu();
        }else{
            // throw new IllegalArgumentException("Invalid menu type");
            System.out.println("Invalid menu type");
            return null;
        }

    }
}

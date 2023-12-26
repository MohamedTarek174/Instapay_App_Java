package Class;


public class MenuStrategy {
    private IMenuFactory menuFactory;
    public Menu currentMenu;

    public MenuStrategy(IMenuFactory menuFactory) {
        this.menuFactory = menuFactory;
    }

    public void setMenuType(String menuType) {
        this.currentMenu = menuFactory.getMenu(menuType);
    }

    public void displayMenu() {
        currentMenu.displayMenu();
    }
}

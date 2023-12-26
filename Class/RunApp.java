package Class;
import static java.lang.System.exit;
import java.util.Scanner;


public class RunApp {  
    public IMenuFactory menuFactory = new MenuFactory();
    public Enteration enteration = new Enteration();
    public InstaAccount curInstaAcc = new InstaAccount();
    public InstaAccount toInstaAcc = new InstaAccount();
    public Menu actionMenu = null;
    public Services services = new Services();
    public DataBase DB = new DataBase();
    Scanner scanner = new Scanner(System.in);
    
    public int startMenu(){
        
        Menu menu = menuFactory.getMenu("Guest");
        int choice = menu.displayMenu();

        return choice;
    }
    

    public void enteration(int choice){
        switch (choice) {
            case 1:
                DB = enteration.signUp(DB);      // Sign Up then update the database
                choice = startMenu();
                enteration(choice);
                break;
            
            case 2:
                curInstaAcc = enteration.signIn(DB);      // get the current account and Sign In

                if (curInstaAcc == null) {              // if the account is not exist
                    System.out.println("Invalid username or password !!!");
                    choice = startMenu();
                    enteration(choice);
                }else{                                  // if the account is exist
                    actionMenu = menuFactory.getMenu(curInstaAcc.getType());
                    int choice2 = actionMenu.displayMenu();
                    action(choice2);
                }
                break;

            case 3:
                exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                choice = startMenu();
                enteration(choice);
                break;
        };
    }


    public void action(int choice){
        
        while (true) {
            
            if (choice == 0) {
                choice = actionMenu.displayMenu();
            }
            
            switch (choice) {
                case 1:
                    
                    DB = services.transfer(curInstaAcc, "Bank", DB);    // Transfer to bank account then update the database
                    choice = 0;
                    break;
                
                case 2:
                    DB = services.transfer(curInstaAcc, "Insta", DB);   // Transfer to insta account then update the database
                    choice = 0;
                    break;
    
                case 3:
                    DB = services.transfer(curInstaAcc, "Wallet", DB);   // Transfer to wallet account then update the database
                    choice = 0;
                    break;
    
                case 4:
                    // Pay Bills
                    DB = services.payBill(curInstaAcc, DB);   // Pay the bill then update the database
                    choice = 0;
                    break;
    
                case 5:
                    System.out.println("Your balance is " + DB.getBalance(curInstaAcc.getUser().getAccount().checker(), curInstaAcc.getUser().getType()));
                    choice = 0;
                    break;

                case 6:
                    choice = startMenu();
                    enteration(choice);
                    break;

                case 7:
                    exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    action(0);
                    break;
            };

        }

    }
    
}

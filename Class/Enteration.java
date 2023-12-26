package Class;
import java.security.PublicKey;
import java.util.Scanner;

public class Enteration {
    // private DataBase Db = new DataBase();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);
    private Scanner scanner3 = new Scanner(System.in);

    public DataBase signUp (DataBase DB){
        String NewUserName;
        String NewName;
        String password;
        String type;
        String identifier;
        User Newuser = new User();
        

        System.out.println("Enter your Name : ");
        NewName = scanner.nextLine();


        System.out.println("Creating Account connected to");
        System.out.println("1- Bank");
        System.out.println("2- E-Wallet");
        int choice = scanner.nextInt();
        
        System.out.println("Enter your account identifier : ");
        identifier = scanner2.nextLine();

        if (choice == 1) {
            type = "Bank";
            
            BankAPI bankAPI = new BankAPI();
            
            Bank bank = bankAPI.verify(identifier);         // Verify the bank account with the bank API
            
            if (bank != null && bankAPI.isVerified()) {    // If the bank account is verified by the bank API
                BankAcc newAcc = new BankAcc(bank);
                Newuser = new User(NewName, type, newAcc);
                newAcc.setBankAPI(bankAPI);
                DB.addBank(newAcc);
            }else{                                          // If the bank account is not verified by the bank API
                System.out.println("Your Bank Account has not been created because your bank ID is not verified!");
                return DB;
            }

        }else if (choice == 2) {
            type = "Wallet";

            IWalletProvider iwalletProvider = new IWalletProvider();
            System.out.println("Enter type of the provider for your wallet : ");
            String providerType = scanner2.nextLine();

            WalletProvider walletProvider = iwalletProvider.getProvider(providerType);
            Wallet wallet = walletProvider.IsExist(identifier);         // Verify the wallet account with the wallet provider

            if (wallet != null && walletProvider.isExist()) {           // If the wallet account is verified by the wallet provider
                WalletAcc newAcc = new WalletAcc(wallet);
                Newuser = new User(NewName, type, newAcc);
                DB.addWallet(newAcc);
            }else{                                                      // If the wallet account is not verified by the wallet provider
                System.out.println("Your Wallet Account has not been created because your mobile number is not exist in the provider!");
                return DB;
            }
            
        }
        
        
        System.out.println("Enter The Username : ");
        NewUserName = scanner2.nextLine();

        while (DB.getInstaUser(NewUserName) != null) {                  // Check if the username is already taken
            System.out.println("This Username is already taken");
            System.out.println("Enter The Username : ");
            NewUserName = scanner2.nextLine();
        }


        System.out.print("Enter password: ");
        password = scanner2.nextLine();

        while (password.length() < 8){                              // Check if the password is less than 8 characters
            System.out.println("Password should contain 8 Char or more");
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }


        InstaAccount NewInstaAcc = new InstaAccount(NewUserName,password, Newuser);

        DB.addInsatUser(NewInstaAcc);                               // Add the new user to the database
        DB.addUser(Newuser);                                        // Add the new user to the database

        System.out.println("The Account created Successfully !!");

        return DB;

    }


    public InstaAccount signIn(DataBase Db){
        String userName,password;
        System.out.println("Enter your Username : ");
        userName = scanner3.nextLine();

        System.out.print("Enter password: ");
        password = scanner3.nextLine();

        while (password.length() < 8){
            System.out.println("Password should contain 8 Char or more");
            System.out.print("Enter password: ");
            password = scanner3.nextLine();
        }

        InstaAccount CurAcc = new InstaAccount();
        CurAcc = Db.getInstaUser(userName,password);    // Search for the insta account in the database

        if (CurAcc == null){
                return CurAcc;   // If the account is not found
        }  
        else{
            System.out.println("Welcome " + CurAcc.getUserName());      // If the account founded
            System.out.println(CurAcc.getType());
        }
        return CurAcc;      // Return the account
    }
}

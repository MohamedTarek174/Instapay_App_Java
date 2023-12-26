package Class;
import java.util.*;

public class DataBase {
    public List<InstaAccount> Instausers = new ArrayList<>();
    public List<User> Users = new ArrayList<>();
    public List<BankAcc> BankAccounts = new ArrayList<>();
    public List<WalletAcc> WalletAccounts = new ArrayList<>();




    public DataBase(){


        Bank bank = new Bank("123","0123456789",10000);
        BankAcc acc1 = new BankAcc(bank);

        Bank bank2 = new Bank("1234","0123456789",10000);
        BankAcc acc2 = new BankAcc(bank2);

        Wallet wallet = new Wallet("012",10000, "BankCompany");
        WalletAcc acc3 = new WalletAcc(wallet);

        Wallet wallet2 = new Wallet("011",10000, "BankCompany");
        WalletAcc acc4 = new WalletAcc(wallet2);

        User user1 = new User("Omar", "Bank",acc1);
        User user2 = new User("Mohamed", "Bank",acc2);
        User user3 = new User("Yossef", "Wallet",acc3);
        User user4 = new User("Zoro", "Wallet",acc4);


        InstaAccount InstaAcc1 = new InstaAccount("omar", "12345678", user1 );
        InstaAccount InstaAcc2 = new InstaAccount("mohamed", "12345678", user2 );
        InstaAccount InstaAcc3 = new InstaAccount("yossef", "12345678", user3 );
        InstaAccount InstaAcc4 = new InstaAccount("zoro", "12345678", user4 );


        // user1.setInstaAccount(InstaAcc1);//After Edits
        // user2.setInstaAccount(InstaAcc2);//After Edits
        // user3.setInstaAccount(InstaAcc3);//After Edits



        // Instausers.add(InstaAcc1);
        // Instausers.add(InstaAcc2);
        // Instausers.add(InstaAcc3);


        Users.add(user1);
        Users.add(user2);
        Users.add(user3);
        Users.add(user4);

        BankAccounts.add(acc1);    
        BankAccounts.add(acc2);
        WalletAccounts.add(acc3);
        WalletAccounts.add(acc4);

        Instausers.add(InstaAcc1);
        Instausers.add(InstaAcc2);
        Instausers.add(InstaAcc3);
        Instausers.add(InstaAcc4);


        // BankAccounts.add(acc1.getBankAcc());//Return Object Bank
        // BankAccounts.add(acc3.getBankAcc());//Return Object Bank
        // WalletAccounts.add(acc3.GetWallet());//Return Object Bank


        // WalletAccounts.add(acc2.getWalletAcc());//Return Object Wallet

    }


    //InstaAccs Getter and Setter
    public void addInsatUser(InstaAccount AddedInstaAcc){
        Instausers.add(AddedInstaAcc);
    }

    public InstaAccount getInstaUser(String userName, String password) {
        for (InstaAccount user : Instausers) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public InstaAccount getInstaUser(String userName) {
        for (InstaAccount user : Instausers) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        System.out.println("The username not exist !!!");
        return null;
    }

    //User Setter and Getter
    public void addUser(User newUser){
        Users.add(newUser);
    }

    public User getUser(String Name){
        for(User user : Users){
            if(user.getName().equals(Name))
                return user;
        }
        return null;
    }


    //Accounts Banks-Wallets Getters
    public void addBank(BankAcc bank){
        BankAccounts.add(bank);
    }
    
    //Get Bank by the ID
    public BankAcc getBank(String BankID) {
        for (BankAcc bank : BankAccounts) {
            if (bank.checker().equals(BankID)) {
                return bank;
            }
        }
        return null;
    }
    
    
    public void addWallet(WalletAcc wallet){
        WalletAccounts.add(wallet);
    }
    //Get the Wallet by the mobile number
    public WalletAcc getWallet(String Mobile) {
        for (WalletAcc wallet : WalletAccounts) {
            if (wallet.checker().equals(Mobile)) {
                return wallet;
            }
        }
        return null;
    }

    public void addBalance(String identifire, double amount, String type){

        if (type.equals("Bank")) {
            for(BankAcc bank : BankAccounts){
                if(bank.checker().equals(identifire)){
                    bank.getBankAcc().addBalance(amount);
                }
            }  
        }else if (type.equals("Wallet")) {
            for(WalletAcc wallet : WalletAccounts){
                if(wallet.checker().equals(identifire)){
                    wallet.getWalletAcc().addBalance(amount);
                }
            }
        }
    }



    public void deductBalance(String identifire, double amount, String type){
        if (type.equals("Bank")) {
            for(BankAcc bank : BankAccounts){
                if(bank.checker().equals(identifire)){
                    bank.getBankAcc().deductBalance(amount);
                }
            }
        }else if (type.equals("Wallet")) {
            for(WalletAcc wallet : WalletAccounts){
                if(wallet.checker().equals(identifire)){
                    wallet.getWalletAcc().deductBalance(amount);
                }
            }
        }
    }



    public double getBalance(String identifire, String type){
        if (type.equals("Bank")) {
            for(BankAcc bank : BankAccounts){
                if(bank.checker().equals(identifire)){
                    return bank.getBankAcc().getBalance();
                }
            }
        }else if (type.equals("Wallet")) {
            for(WalletAcc wallet : WalletAccounts){
                if(wallet.checker().equals(identifire)){
                    return wallet.getWalletAcc().getBalance();
                }
            }
        }

        return 0;
    }
    


    // public String getNameUser(String BankID){
    //     for(User user : Users){
    //         if(user.getAccount().checker().equals(BankID))
    //             return user.getName();
    //     }
    //     return null;
    // }

    

    // Get InstaAccount from BankID
    // public InstaAccount GetInsataBank(String BankID){
    //     for(InstaAccount instaaccs : Instausers){
    //         if(instaaccs.getUser().getAccount().checker().equals(BankID)){//Reach the Bank to get the Balance in the transaction
    //             return instaaccs;
    //         }
    //     }
    //     return null;
    // }

    //Get InstaAccount from Wallet Number
    // public InstaAccount GetInsataWallet(String MobileNum){
    //     for(InstaAccount instaaccs : Instausers){
    //         if(instaaccs.getUser().getAccount().checker().equals(MobileNum)){
    //             return instaaccs;
    //         }
    //     }
    //     return null;
    // }

    //Get InstaAccount from UserName
    // public InstaAccount GetInsataUserName(String UserName){
    //     for(InstaAccount instaaccs : Instausers){
    //         if(instaaccs.getUser().getName().equals(UserName)){
    //             return instaaccs;
    //         }
    //     }
    //     return null;
    // }



}

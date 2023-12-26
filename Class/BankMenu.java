package Class;

import static java.lang.System.exit;

public class BankMenu implements Menu {
    @Override
    public String getType() {
        return "Bank";
    }
    @Override
    public int displayMenu() {
        System.out.println("Bank Menu");
        System.out.println("1. Transfer to bank account");
        System.out.println("2. Transfer to insta account");
        System.out.println("3. Transfer to wallet");
        System.out.println("4. Pay Bills");
        System.out.println("5. Check Balance");
        System.out.println("6. Sign Out");
        System.out.println("7. Exit");
        return Choice.nextInt();
    }
    
    // public InstaAccount TakeAction(InstaAccount account){
    //     Services services = new Services();//Create the Object as the user can choose Bills or transactions
    //     Transaction transaction;//Transaction Option

    //     DataBase DB = new DataBase();//To Get the toAccount from
    //     String input = Choice.nextLine();
    //     try {
    //         switch (input) {
    //             case "1"://Transfer to Bank
    //                 //Add Receiver
    //                 System.out.print("Enter the Receiver Bank-ID : ");
    //                 String Input_ID = Choice.nextLine();

    //                 //Add Amount
    //                 System.out.print("Enter the Amount : ");
    //                 Double Amount = Choice.nextDouble();

    //                 // InstaAccount toinstaAccount = DB.GetInsataBank(Input_ID);//Receiver using ID

    //                 // services.transfer(account,toinstaAccount,Amount,"Bank");
    //                 break;
    //             case "2"://Transfer to Insta
    //                 //Add Receiver
    //                 System.out.print("Enter the Receiver User_Name : ");
    //                 String UserName = Choice.nextLine();

    //                 //Add Amount
    //                 System.out.print("Enter the Amount : ");
    //                 Double Amount1 = Choice.nextDouble();

    //                 // InstaAccount toinstaAccount1 = DB.GetInsataUserName(UserName);//Receiver using username
    //                 // services.transfer(account,toinstaAccount1,Amount1,"Insta");
    //                 break;
    //             case "3"://Transfer to Wallet
    //                 //Add Receiver
    //                 System.out.print("Enter the Receiver Wallet Number : ");
    //                 String WalletNumber = Choice.nextLine();

    //                 //Add Amount
    //                 System.out.print("Enter the Amount : ");
    //                 Double Amount2 = Choice.nextDouble();

    //                 // InstaAccount toinstaAccount2 = DB.GetInsataWallet(WalletNumber);//Receiver using Wallet Number
    //                 // services.transfer(account,toinstaAccount2,Amount2,"Wallet");
    //                 break;
    //             case "4":
    //                 services.payBill();

    //             case "5"://CheckBalance
    //                 System.out.println(account.getUser().getAccount().getBalance());
    //                 break;
    //             case "6" :
    //                 exit(0);

    //             default:
    //                 throw new IllegalArgumentException("Invalid menu type");
    //         }
    //     }
    //     catch (IllegalArgumentException e) {
    //         System.out.println("Error: " + e.getMessage());
    //     }
    //     return null;
    // }


}

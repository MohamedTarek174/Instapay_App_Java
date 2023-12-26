package Class;
import java.util.Scanner;

public class Services {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);


    public DataBase transfer(InstaAccount fromAccount, String type ,DataBase DB) {
        Transaction transaction = null;

        if(type.equals("Bank")){
            transaction = new BankTransaction();
        }
        else if(type.equals("Wallet")){
            transaction = new WalletTransaction();
        }
        else if(type.equals("Insta")){
            transaction = new InstaAccountTransaction();
        }

        System.out.println("Enter the amount");
        double amountTrans = scanner.nextDouble();

        return transaction.transfer(fromAccount, amountTrans, DB);    // Update the balances after the transaction
    }


    public DataBase payBill(InstaAccount fromAccount, DataBase DB) {

        String billID;
        System.out.println("Enter the ID of the bill");
        billID = scanner2.nextLine();

        lBillFactory factory = new BillFactory();
        Bill bill = factory.getbill(billID, DB.getBalance(fromAccount.getUser().getAccount().checker(), fromAccount.getUser().getType()) );
        
        if (bill != null) {
            double amount = bill.getAmount();
            System.out.println("The amount of the bill is " + amount);
            DB.deductBalance(fromAccount.getUser().getAccount().checker(), amount, fromAccount.getUser().getType());
            System.out.println("bill paid Successfully");
        }
        
        return DB;

    }
}

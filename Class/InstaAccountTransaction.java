package Class;

import java.util.Scanner;

public class InstaAccountTransaction implements Transaction {


    @Override
    public DataBase transfer(InstaAccount fromAccount, double amount, DataBase DB) {
        Scanner Choice = new Scanner(System.in);
            
            if (amount > DB.getBalance(fromAccount.getUser().getAccount().checker(), fromAccount.getUser().getType())) {// Check if the balance is enough
                System.out.println("You don't have enough money");

                return DB;
            } else {
                System.out.println("Enter the Adress of insta you want to transfer to");
                String toAddress = Choice.nextLine();

                if (DB.getInstaUser(toAddress) == null) {                   // Check if the account exists
                    System.out.println("This account doesn't exist");
                    transfer(fromAccount, amount, DB);
                } else{
                // bring the account first from the Address
                DB.addBalance(DB.getInstaUser(toAddress).getUser().getAccount().checker(), amount, DB.getInstaUser(toAddress).getUser().getType());   // Update the balance of the account you want to transfer to
                DB.deductBalance(fromAccount.getUser().getAccount().checker(), amount, fromAccount.getUser().getType()); // Update the balance of the account you want to transfer from
                System.out.println("Transfer done successfully");
                System.out.println("Your new balance is " + DB.getBalance(fromAccount.getUser().getAccount().checker(), fromAccount.getUser().getType()));
                }

                return DB;
            }
    }
}

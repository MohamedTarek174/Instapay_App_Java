package Class;

import java.util.Scanner;

public class BankTransaction implements Transaction {
    Scanner Choice = new Scanner(System.in);


    @Override
    public DataBase transfer(InstaAccount fromAccount, double amount, DataBase DB) {
        // BankAcc toAccount = null;
        if (amount > DB.getBalance(fromAccount.getUser().getAccount().checker(),fromAccount.getUser().getType())) {  // Check if the balance is enough
            System.out.println("You don't have enough money");

            return DB;
            
        }else{
            System.out.println("Enter the account number you want to transfer to");
            String toAccountNumber = Choice.nextLine();

            if (DB.getBank(toAccountNumber) == null) {              // Check if the account exists
                System.out.println("This account doesn't exist");
                transfer(fromAccount, amount, DB);
            }else{
            DB.addBalance(toAccountNumber, amount, "Bank");     // Update the balance of the account you want to transfer to
            DB.deductBalance(fromAccount.getUser().getAccount().checker(), amount, fromAccount.getUser().getType());// Update the balance of the account you want to transfer from
            System.out.println("Transfer done successfully");
            System.out.println("Your new balance is " + DB.getBalance(fromAccount.getUser().getAccount().checker(), fromAccount.getUser().getType()));
            }

            return DB;
        }
    }
}

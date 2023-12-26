package Class;


public class BankAcc extends Account {
    public Bank bankAcc;
    private BankAPI bankAPI;

    public BankAcc(Bank bankAcc) {
        
        this.type = "Bank";
        this.bankAcc = bankAcc;

        // if (Verify(bankAcc.getBankId())) {
        //     this.bankAcc = bankAcc;
        //     System.out.println("Your Bank Account has been created successfully!");
        // }else{
        //     System.out.println("Your Bank Account has not been created because your bank ID is not verified!");
        // }

    }

    // public boolean Verify(String bankId){
    //     BankAPI NewAPI = new BankAPI();
    //     this.bankAPI = NewAPI;
    //     NewAPI.verify(bankId);

    //     if(NewAPI.isVerified()){
    //         System.out.println("Good");
    //         return true;
    //     }else{
    //         System.out.println("Bad");
    //         return false;
    //     }

        
    // }


    @Override
    public double getBalance() {
        return bankAcc.getBalance();
    }



    public Bank getBankAcc() {
        return bankAcc;
    }
    public String checker(){
        return bankAcc.getBankId();
    }

    public BankAPI getBankAPI() {
        return bankAPI;
    }

    public void setBankAcc(Bank bankAcc) {
        this.bankAcc = bankAcc;
    }

    public void setBankAPI(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void deductBalance(double amount) {
        bankAcc.deductBalance(amount);
    }

    public void addBalance(double amount) {
        bankAcc.addBalance(amount);
    }

    public void print() {
        bankAcc.print();
    }
    public Wallet GetWallet() {
        return null;
    }
}

package Class;

public class BankAPI{

    private boolean Isverified;

    public BankAPI() {
        Isverified = false;
    }

    public boolean isVerified() {
        return Isverified;
    }

    public void setVerified(boolean verified) {
        Isverified = verified;
    }


    public Bank verify(String bankId) {
        System.out.println("Verifying with Bank API...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");

        Isverified = true;
        Bank bank = new Bank(bankId,"01111111111",20000);

        return bank;
    }
}

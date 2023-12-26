package Class;

public class MobileVerification {
    private boolean Isverified;

    public MobileVerification() {
        Isverified = false;
    }

    public boolean isVerified() {
        return Isverified;
    }

    public void setVerified(boolean verified) {
        Isverified = verified;
    }

    public boolean verify(String mobileNumber) {
        System.out.println("Verifying the number...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");

        Isverified = true;
        return true;
    }
}

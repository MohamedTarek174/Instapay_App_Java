package Class;

abstract public class WalletProvider {
    private boolean IsExist;

    public WalletProvider() {
        IsExist = false;
    }

    public boolean isExist() {
        return IsExist;
    }

    public void setExist(boolean exist) {
        IsExist = exist;
    }

    abstract public Wallet IsExist(String mobileNumber);
}

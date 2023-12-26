package Class;

abstract public class Account {
    String type;

    public Account(String Type) {
        this.type = Type;
    }
    public Account(){}


    public String getType() {
        return type;
    }
    public abstract double getBalance();

    public abstract String checker();//To return ID / Mobile
    public abstract Wallet GetWallet();


    abstract public void deductBalance(double amount);
    abstract public void addBalance(double amount);


}
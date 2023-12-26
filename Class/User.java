package Class;

public class User {
    String name;
    InstaAccount instaAccount;
    String type;
    Account defAcc;

    public User(String name, String type,Account defAcc) {
        this.name = name;
        this.type = type;
        this.defAcc = defAcc;
    }
    
    public User(){}

    // Getter and Setter methods for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for InstaAccount
    public InstaAccount getInstaAccount() {
        return instaAccount;
    }

    public void setInstaAccount(InstaAccount instaAccount) {
        this.instaAccount = instaAccount;
    }

    // Getter and Setter methods for Type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter methods for Account
    public Account getAccount() {
        return defAcc;
    }
    //public Bank getter

    public void setAccount(Account account) {
        this.defAcc = account;
    }
}

package Class;

public class InstaAccount {
    private String userName;
    private String password;
    private Services service;
    private String type;
    private User user;


    public InstaAccount(String username, String password, User user ) {
        this.userName = username;
        this.password = password;
        this.type = user.getAccount().getType();
        this.user = user;
    }

    public InstaAccount(){}
    //MenuFactory ActionMenu;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(User user){this.user = user;}
    public User getUser(){return user;}
}


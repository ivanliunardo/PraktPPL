public class User {
    private String userId;
    private String password;
    private boolean loginStatus = true; 

    public User(String userId, String password, boolean loginStatus ) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = true;
    }

    public boolean verifyLogin() {
        return this.loginStatus;
    }
    
}
package models;


/**
 *
 * @author 822408
 */
public class AccountService {
    
    public User login(String username, String password) {        
        if (username.equalsIgnoreCase("abe") || username.equalsIgnoreCase("barb")) {
            if (password.equals("password")) {
                User user = new User(username, null);
                return user;
            }
            else 
                return null;
        }
        else 
            return null;
    }
}

package BookMyShow.Users;

import BookMyShow.Enum.AccountStatus;

public class Account {

    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword() {
        return true;
    }

}

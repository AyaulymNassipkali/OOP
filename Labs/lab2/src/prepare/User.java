package prepare;

import java.util.Objects;

public class User {
    public String login;
    public String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o instanceof User anotherUser){
            return this.login.equals(anotherUser.login) && this.password.equals(anotherUser.password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}

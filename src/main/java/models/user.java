package models;

public class User {

    public String username;
    public String password;
    public int settingsId;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public User(String username, char[] password) {
        super();
        this.username = username;
        this.password = String.valueOf(password);

    }

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", password=" + password + '}';
    }
}

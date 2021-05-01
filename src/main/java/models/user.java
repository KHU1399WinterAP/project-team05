
package models;

public class user {
    public String username;
    public String password;
    public int settingsId;
    public user(String username,String password){
       this.username=username;
       this.password=password;
      
   
    }
    public user(String username, char [] password) {
	super();
	this.username = username;
	this.password = String.valueOf(password);
        
}

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", password=" + password +  '}';
    }
}

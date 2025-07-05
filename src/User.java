public class User {
    // attributes
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String phone ;
    protected String password;
    protected String id;

    // constructor(s)
    public User(String firstName, String lastName , String username , String phone , String password , String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.password = password;
        this.phone = phone ;
        this.username = username;
    }
}

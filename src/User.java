public class User {


    //attributes
    public String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public  boolean login(String email,String password) {
        return this.email.equals(email) && this.password.equals(password) ;
    }

    public static User register(String name, String email, String password){

        return new User(name, email, password);
    }
}

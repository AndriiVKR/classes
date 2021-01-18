package wagwalking;

public class Client {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;

    public Client(String email, String password, String firstName, String lastName, String phone) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }

    public void setEmail() {
        this.email = email;
    }
}

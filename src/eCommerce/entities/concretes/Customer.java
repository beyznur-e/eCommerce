package eCommerce.entities.concretes;

import java.util.List;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    List<String> eMail;

    public Customer() {
    }
    public Customer(int id, String password, List<String> eMail, String lastName, String firstName) {
        this.id = id;
        this.password = password;
        this.eMail = eMail;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> geteMail() {
        return eMail;
    }

    public void seteMail(List<String> eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


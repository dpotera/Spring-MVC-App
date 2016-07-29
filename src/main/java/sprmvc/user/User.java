package sprmvc.user;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private int id;

    @NotNull
    @Size(min = 5,max = 16)
    private String userName;

    @NotNull
    @Size(min = 5,max = 25)
    private String password;

    @NotNull
    @Size(min = 3,max = 30)
    private String firstName;

    @NotNull
    @Size(min = 5,max = 16)
    private String lastName;

    private String email;

    public User() {}

    public User(String userName, String password, String firstName, String lastName, String email) {
        this(0, userName, password, firstName, lastName, email);
    }

    public User(int id, String userName, String password, String firstName, String lastName, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, "userName", "firstName", "lastName", "password", "email");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "userName", "firstName", "lastName", "password", "email");
    }
}

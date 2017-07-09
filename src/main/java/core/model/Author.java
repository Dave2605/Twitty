package core.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Author {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    @Column(name = "firstName")
    @NotEmpty
    @Size(min=5, max=16, message = "Please, enter your first name")
    private String firstName;

    @Column(name = "lastName")
    @NotEmpty
    @Size(min=5, max=16, message = "Please, enter your last name")
    private String lastName;

    @Column(name = "userName")
    @NotEmpty
    @Size(min=5, max=16, message = "Please, enter your user name")
    private String userName;

    @Column(name = "password")
    @NotEmpty
    @Size(min=5, max=16, message = "Please, enter your password")
    private String password;

    @Column(name = "email")
    @NotEmpty(message = "Please enter your email")
    @Email
    private String email;

    private MultipartFile profilePicture;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MultipartFile getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(MultipartFile profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

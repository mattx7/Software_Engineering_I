package se1app.entity;

import se1app.types.Password;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by MattX7 on 06.11.2016.
 */

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Integer id;

    private String username;
    private Password password;

    @OneToOne
    private User user;

    public Account(String username, Password password) {
        this.username = username;
        this.password = password;
        this.user = new User();
    }

    //GETTER
    public String getUsername() {
        return username;
    }

    public Password getPassword() {
        return password;
    }

    public User getUser() {
        return user;
    }

    //SETTER
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account toCompare = (Account) o;
            return this.id.equals(toCompare.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "Account[id=%d, username='%s', password='&s']",
                id, username, password);
    }
}

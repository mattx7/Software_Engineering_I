package se1app.entity;

import se1app.types.PasswordType;

import javax.persistence.*;

/**
 * Created by MattX7 on 06.11.2016.
 */

@Entity
public class Account {
    private String username;
    private PasswordType password;

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public Account(String username, PasswordType password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public PasswordType getPassword() {
        return password;
    }

    public User getUser() {
        return user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(PasswordType password) {
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
                "Account[id=%d, username='%s', password='%s']",
                id, username, password);
    }
}

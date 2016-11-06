package se1app.entitie;

import se1app.entitie.types.Password;

import javax.persistence.Entity;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class Account {

    private String username;
    private Password password;
    private User user;
}

package se1app.entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class Residence {

    @Id
    @GeneratedValue
    private Integer id;

    private String ortname;

    public Residence(String ortname) {
        this.ortname = ortname;
    }

    //GETTER
    public String getOrtname() {
        return ortname;
    }

    //SETTER
    public void setOrtname(String ortname) {
        this.ortname = ortname;
    }
}

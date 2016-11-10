package se1app.entity;

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

    private String name;

    public Residence(String name) {
        this.name = name;
    }

    //GETTER
    public String getName() {
        return name;
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
}

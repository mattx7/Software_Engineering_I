package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Character {

    private String name;

    @Id
    @GeneratedValue
    private Integer id;

    public Character() {}

    public Character(String name)
    {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
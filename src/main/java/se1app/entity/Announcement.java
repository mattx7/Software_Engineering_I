package se1app.entity;

import se1app.types.SportsType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class Announcement {
    private SportsType category;
    private String description;
    private Date creationDate;

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private User owner;

    public Announcement(SportsType category, String description, User owner, Date creationDate) {
        this.category = category;
        this.description = description;
        this.owner = owner;
        this.creationDate = creationDate;
    }

    public SportsType getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public User getOwner() {
        return owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCategory(SportsType category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }
}

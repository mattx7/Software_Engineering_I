package se1app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class Announcement {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private Sports category;
    private String description;
    @ManyToOne
    private User owner;
    private Date creationDate;

    public Announcement(Sports category, String description, User owner, Date creationDate) {
        this.category = category;
        this.description = description;
        this.owner = owner;
        this.creationDate = creationDate;
    }


    public Sports getCategory() {
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

    public void setCategory(Sports category) {
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

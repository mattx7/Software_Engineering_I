package se1app.entitie;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class Announcement {

    private Sports category;
    private String description;
    private User owner;
    private Date creationDate;

    public Announcement(Sports category, String description, User owner, Date creationDate) {
        this.category = category;
        this.description = description;
        this.owner = owner;
        this.creationDate = creationDate;
    }


    //GETTER
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

    //SETTER
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
}

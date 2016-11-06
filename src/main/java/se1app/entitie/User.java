package se1app.entitie;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class User {

    private List profileImages;
    private String telNr;
    private String description;
    private String gender;
    private String relationship;
    private Residence residence;
    private String languages;
    private List<Sports> favSports;
    private List<Announcement> favAnnos;


    //TODO constructors with optional languages, relationsship, description and so on...

    public User() {
        //TODO
    }

    //GETTER
    public List getProfileImages() {
        return profileImages;
    }

    public String getTelNr() {
        return telNr;
    }

    public String getDescription() {
        return description;
    }

    public String getGender() {
        return gender;
    }

    public String getRelationship() {
        return relationship;
    }

    public Residence getResidence() {
        return residence;
    }

    public String getLanguages() {
        return languages;
    }

    public List<Sports> getFavSports() {
        return favSports;
    }

    public List<Announcement> getFavAnnos() {
        return favAnnos;
    }

    //SETTER

    public void setProfileImages(List profileImages) {
        this.profileImages = profileImages;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setFavSports(List<Sports> favSports) {
        this.favSports = favSports;
    }

    public void setFavAnnos(List<Announcement> favAnnos) {
        this.favAnnos = favAnnos;
    }
}

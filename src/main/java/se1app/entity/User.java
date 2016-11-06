package se1app.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private List profileImages;
    private String telNr;
    private String description;
    private String gender;
    private String relationship;

    @OneToOne
    private Residence residence;

    private String languages;

    @ManyToMany
    private List<Sports> favSports;

    @ManyToMany
    private List<Announcement> favAnnos;

    //TODO AnnouncementSearch

    //TODO Create user
    public User() {

    }

    //TODO deleteProfile
    public static void deleteProfile() {

    }

    //TODO addProfilePicture
    public static void addProfilePicture() {

    }

    //TODO deleteProfilePicture
    public static void deleteProfilePicture() {

    }

    //TODO sendContactRequest
    public void sendContactRequest(User user) {

    }

    //TODO editAnnouncement
    public void editAnnouncement(Announcement announcement) {

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

    //TODO getMyAnnouncements

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

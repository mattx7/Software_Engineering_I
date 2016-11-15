package se1app.entity;

import se1app.types.ImageType;
import se1app.types.SportsType;

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

    private ImageType profileImages; // TODO später als Liste
    private String telNr;
    private String description;
    private String gender;
    private String relationship;
    private String languages;
    @ElementCollection
    private List<SportsType> favSports;

    @OneToOne
    private Residence residence;

    @ManyToMany
    private List<Announcement> favAnnos;


    public User() {

    }

    //TODO deleteProfile
    public void deleteProfile() {

    }

    //TODO addProfilePicture
    public void addProfilePicture() {

    }

    //TODO deleteProfilePicture
    public void deleteProfilePicture() {

    }

    //TODO sendContactRequest
    public void sendContactRequest(User user) {

    }

    //TODO editAnnouncement
    public void editAnnouncement(Announcement announcement) {

    }

    public ImageType getProfileImages() {
        return profileImages;
    }

    public void setProfileImages(ImageType profileImages) {
        this.profileImages = profileImages;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void addFavoriteSport(SportsType sport) {
        this.favSports.add(sport);
    }

    public void removeFavoriteSport(SportsType sport) {
        this.favSports.remove(sport);
    }

    public void addFavoriteAnnouncement(Announcement announcement) {
        this.favAnnos.add(announcement);
    }

    public void removeFavoriteAnnouncement(Announcement announcement) {
        this.favAnnos.remove(announcement);
    }

    public Integer getId() {
        return id;
    }


    public void setFavSports(List<SportsType> favSports) {
        this.favSports = favSports;
    }
}

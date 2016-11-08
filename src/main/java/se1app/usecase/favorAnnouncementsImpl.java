package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.entity.User;
import se1app.types.Distance;
import se1app.types.Filter;

import java.util.List;

// Klasse für die Implementierung der Use-Case- bzw. User-Story-Operationen
public class favorAnnouncementsImpl implements favorAnnouncementsUseCase {

    /**
     * Standard output are all Announcements.
     *
     * @return all Announcements
     */
    @Override
    public List<Announcement> getAllAnnouncements() {
        return null; // TODO getAllAnnouncements()
    }

    /**
     * Returns the Filter with the options the User did.
     *
     * @return the Filter with the options the User did.
     */
    @Override
    public Filter getFilter() {
        return null; // TODO getFilter()
    }

    /**
     * search for sport announcements.
     *
     * @param category which sport are we looking for
     * @param distance max distance
     * @return Announcements you have searched for.
     */
    @Override
    public List<Announcement> searchAnnouncements(Sports category, Distance distance) {
        return null; // TODO searchAnnouncements()
    }

    /**
     * Adds an announcement to the list of favorites.
     *
     * @param announcement which we want to favor.
     * @param user
     */
    @Override
    public void addToFavorites(Announcement announcement, User user) {
        // TODO addToFavorites()
    }
}

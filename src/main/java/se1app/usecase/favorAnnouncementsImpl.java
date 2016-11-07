package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.types.Distance;

import java.util.Collection;

// Klasse für die Implementierung der Use-Case- bzw. User-Story-Operationen
public class favorAnnouncementsImpl implements favorAnnouncementsUseCase {

    /**
     * search for sport announcements
     *
     * @param category which sport are we looking for
     * @param distance max distance
     * @return Announcements you have searched for
     */
    @Override
    public Collection<Announcement> searchAnnouncements(Sports category, Distance distance) {
        return null;
    }

    /**
     * Adds an announcement to the list of favorites
     *
     * @param announcement which we want to favor
     */
    @Override
    public void addToFavorites(Announcement announcement) {

    }

    /**
     * Get all favoured Announcements
     *
     * @return Your favorite announcements
     */
    @Override
    public Collection<Announcement> getFavoriteAnnouncements() {
        return null;
    }
}

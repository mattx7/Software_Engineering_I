package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.types.Distance;

import java.util.Collection;

// Interface für unsere Systemoperationen
public interface favorAnnouncementsUseCase {

    /**
     * search for sport announcements
     *
     * @param category which sport are we looking for
     * @param distance max distance
     * @return Announcements you have searched for
     */
    Collection<Announcement> searchAnnouncements(Sports category, Distance distance);

    /**
     * Adds an announcement to the list of favorites
     *
     * @param announcement which we want to favor
     */
    void addToFavorites(Announcement announcement);

    /**
     * Get all favoured Announcements
     *
     * @return Your favorite announcements
     */
    Collection<Announcement> getFavoriteAnnouncements();
}

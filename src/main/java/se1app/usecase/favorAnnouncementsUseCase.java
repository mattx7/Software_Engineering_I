package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.types.Distance;

// Interface für unsere Systemoperationen
public interface favorAnnouncementsUseCase {

    /**
     * search for sport announcements
     *
     * @param category which sport are we looking for
     * @param distance max distance
     */
    void searchAnnouncements(Sports category, Distance distance);


    /**
     * Adds an announcement to the list of favorites
     *
     * @param announcement which we want to favor
     */
    void addToFavorites(Announcement announcement);


}

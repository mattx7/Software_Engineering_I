package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.types.Distance;

// Interface für unsere Systemoperationen
public interface favorAnnouncementsUseCase {

    /**
     * @param category
     * @param distance
     */
    void search(Sports category, Distance distance);


    /**
     * @param announcement
     */
    void addToFavorites(Announcement announcement);


}

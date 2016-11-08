package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.entity.User;
import se1app.exception.TechnicalProblemException;
import se1app.types.Distance;
import se1app.types.Filter;

import java.util.List;

// Klasse für die Implementierung der Use-Case- bzw. User-Story-Operationen
public class favorAnnouncementsImpl implements favorAnnouncementsUseCase {

    /**
     * Standard output are all Announcements
     *
     * @return all Announcements
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public List<Announcement> getAllAnnouncements() throws TechnicalProblemException {
        return null;
    }

    /**
     * Returns the Filter with the options the User did
     *
     * @return the Filter with the options the User did
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public Filter getFilter() throws TechnicalProblemException {
        return null;
    }

    /**
     * search for sport announcements.
     *
     * @param category which sport are we looking for
     * @param distance max distance
     * @return Announcements you have searched for
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public List<Announcement> searchAnnouncements(Sports category, Distance distance) throws TechnicalProblemException {
        return null;
    }

    /**
     * Adds an announcement to the list of favorites.
     *
     * @param user         who want to add the announcement
     * @param announcement which we want to favor
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public void addToFavorites(User user, Announcement announcement) throws TechnicalProblemException {

    }
}

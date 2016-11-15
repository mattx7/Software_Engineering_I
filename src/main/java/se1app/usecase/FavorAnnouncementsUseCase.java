package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.User;
import se1app.exception.TechnicalProblemException;
import se1app.types.FilterType;
import se1app.types.FilterableType;

import java.util.List;

// Interface für unsere Systemoperationen
public interface FavorAnnouncementsUseCase {

    // 2. Gibt ohne Eingabe ertmal alles aus.

    /**
     * Standard output are all Announcements
     *
     * @return all Announcements
     * @throws TechnicalProblemException Exception from persistence layer
     */
    List<Announcement> getAllAnnouncements() throws TechnicalProblemException;

    // 5. liest die Filtereinstellungen des Benutzers ein.

    /**
     * Returns the Filter with the options the User did
     *
     * @param filterables params for the Filter
     * @return the Filter with the options the User did
     * @throws TechnicalProblemException Exception from persistence layer
     */
    public <T extends FilterableType> FilterType createFilter(T... filterables) throws TechnicalProblemException;

    // 6. Sucht die passenden Announcements heraus.

    /**
     * search for sport announcements.
     *
     * @param filter includes Filterable Types
     * @return Announcements you have searched for
     * @throws TechnicalProblemException Exception from persistence layer
     */
    public List<Announcement> searchAnnouncements(FilterType filter) throws TechnicalProblemException;

    // 9. fügt Announcement zu favoriten hinzu

    /**
     * Adds an announcement to the list of favorites.
     *
     * @param user         who want to add the announcement
     * @param announcement which we want to favor
     * @throws TechnicalProblemException Exception from persistence layer
     */
    void addToFavorites(User user, Announcement announcement) throws TechnicalProblemException;
}

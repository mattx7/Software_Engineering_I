package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.entity.User;
import se1app.types.Distance;
import se1app.types.Filter;

import java.util.List;

// Interface für unsere Systemoperationen
public interface favorAnnouncementsUseCase {

    // 2. Gibt ohne Eingabe ertmal alles aus.
    /**
     * Standard output are all Announcements.
     *
     * @return all Announcements
     */
    List<Announcement> getAllAnnouncements();

    // 5. liest die Filtereinstellungen des Benutzers ein.
    /**
     * Returns the Filter with the options the User did.
     *
     * @return the Filter with the options the User did.
     */
    Filter getFilter();

    // 6. Sucht die passenden Announcements herraus.
    /**
     * search for sport announcements.
     *
     * @param category which sport are we looking for
     * @param distance max distance
     * @return Announcements you have searched for.
     */
    List<Announcement> searchAnnouncements(Sports category, Distance distance);

    // 9. fügt Announcement zu favoriten hinzu
    /**
     * Adds an announcement to the list of favorites.
     *
     * @param announcement which we want to favor.
     */
    void addToFavorites(Announcement announcement, User user);
}

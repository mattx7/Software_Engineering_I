package se1app.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.entity.User;
import se1app.exception.TechnicalProblemException;
import se1app.repository.AnnouncementRepository;
import se1app.types.Distance;
import se1app.types.Filter;
import se1app.types.Filterable;
import se1app.types.Keyword;

import java.util.List;

// Klasse für die Implementierung der Use-Case- bzw. User-Story-Operationen
@Service
public class favorAnnouncementsImpl implements favorAnnouncementsUseCase {

    private final AnnouncementRepository announcementRepository;

    @Autowired
    public favorAnnouncementsImpl(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    /**
     * Standard output are all Announcements
     *
     * @return all Announcements
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public List<Announcement> getAllAnnouncements() throws TechnicalProblemException {
        return announcementRepository.findAll();
    }

    /**
     * Returns the Filter with the options the User did
     *
     * @param filterables params for the Filter
     * @return the Filter with the options the User did
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public final <T extends Filterable> Filter createFilter(T... filterables) throws TechnicalProblemException {
        Filter filter = new Filter();
        for (T elem : filterables) {
            if (elem.getClass() == Distance.class)
                filter.setDistance((Distance) elem);
            if (elem.getClass() == Sports.class)
                filter.setCategory((Sports) elem);
            if (elem.getClass() == Keyword.class)
                filter.addKeyword((Keyword) elem);
        } // TODO FRAGE! is that right? and safe?
        return filter;
    }

    public final Filter createFilter(Distance distance, Sports category) throws TechnicalProblemException {
        return new Filter(category, distance);
    }

    /**
     * search for sport announcements.
     *
     * @param filter includes Filterable Types
     * @return Announcements you have searched for
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public List<Announcement> searchAnnouncements(Filter filter) throws TechnicalProblemException {
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
        user.addFavoriteAnnouncement(announcement);
    }
}

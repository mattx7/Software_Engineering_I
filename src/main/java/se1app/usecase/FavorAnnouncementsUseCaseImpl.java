package se1app.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se1app.entity.Announcement;
import se1app.entity.User;
import se1app.exception.TechnicalProblemException;
import se1app.repository.AnnouncementRepository;
import se1app.types.*;

import java.util.List;

// Klasse für die Implementierung der Use-Case- bzw. User-Story-Operationen
@Service
public class FavorAnnouncementsUseCaseImpl implements FavorAnnouncementsUseCase {

    private final AnnouncementRepository announcementRepository;

    @Autowired
    public FavorAnnouncementsUseCaseImpl(AnnouncementRepository announcementRepository) {
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
    public final <T extends FilterableType> FilterType createFilter(T... filterables) throws TechnicalProblemException {
        FilterType filter = new FilterType();
        for (T elem : filterables) {
            if (elem.getClass() == DistanceType.class)
                filter.setDistance((DistanceType) elem);
            if (elem.getClass() == SportsType.class)
                filter.setCategory((SportsType) elem);
            if (elem.getClass() == KeywordType.class)
                filter.addKeyword((KeywordType) elem);
        } // TODO FRAGE! is that right? and safe?
        return filter;
    }

    public final FilterType createFilter(SportsType category) throws TechnicalProblemException {
        return new FilterType(category);
    }

    /**
     * search for sport announcements.
     *
     * @param filter includes Filterable Types
     * @return Announcements you have searched for
     * @throws TechnicalProblemException Exception from persistence layer
     */
    @Override
    public List<Announcement> searchAnnouncements(FilterType filter) throws TechnicalProblemException {
        return announcementRepository.findByCategory(filter.getCategory()); //TODO try_catch
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
        // TODO speichern
    }
}

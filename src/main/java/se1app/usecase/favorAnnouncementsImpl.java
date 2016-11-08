package se1app.usecase;

import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.entity.User;
import se1app.types.Distance;

import java.util.Collection;

// Klasse für die Implementierung der Use-Case- bzw. User-Story-Operationen
public class favorAnnouncementsImpl implements favorAnnouncementsUseCase {

    @Override
    public Collection<Announcement> searchAnnouncements(Sports category, Distance distance) {
        return null;
    }

    @Override
    public void addToFavorites(Announcement announcement, User user) {

    }

    @Override
    public Collection<Announcement> getFavoriteAnnouncements(User user) {
        return null;
    }

    @Override
    public void getDistance(Announcement announcement) {

    }

    @Override
    public void getCategory(Announcement announcement) {

    }
}

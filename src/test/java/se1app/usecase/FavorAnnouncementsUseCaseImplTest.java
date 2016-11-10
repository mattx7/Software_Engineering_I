package se1app.usecase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import se1app.Application;
import se1app.entity.Announcement;
import se1app.entity.Sports;
import se1app.entity.User;
import se1app.repository.AnnouncementRepository;
import se1app.repository.SportsRepository;
import se1app.repository.UserRepository;
import se1app.types.Filter;

import java.util.Date;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by MattX7 on 10.11.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class FavorAnnouncementsUseCaseImplTest {

    @Autowired
    FavorAnnouncementsUseCaseImpl useCase;

    @Autowired
    SportsRepository sportsRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AnnouncementRepository announcementRepository;

    @Before
    public void setUp() throws Exception {
        Date datumuno = new Date(2016, 12, 16, 12, 12);
        User useruno = new User();
        userRepository.save(useruno);

        Sports jogging = Sports.JOGGING;
        sportsRepository.save(jogging);
        Announcement announo = new Announcement(jogging, "Eine Beschreibung", useruno, datumuno);
        announcementRepository.save(announo);

        Date datumdos = new Date(2016, 12, 16, 12, 12);
        User userdos = new User();
        userRepository.save(userdos);

        Sports biking = Sports.BIKING;
        sportsRepository.save(biking);
        Announcement annodos = new Announcement(biking, "Zweite Beschreibung", userdos, datumdos);
        announcementRepository.save(annodos);

    }

    @Test
    public void testCreateFilter() throws Exception {
        sportsRepository.save(Sports.BIKING);
        Filter filter = useCase.createFilter(Sports.BIKING);
        assertThat(filter.getCategory().equals(Sports.BIKING));
    }

    @Test
    public void testSearchAnnouncements() throws Exception {
        sportsRepository.save(Sports.BIKING);
        Filter filter = useCase.createFilter(Sports.BIKING);
        assertThat(useCase.searchAnnouncements(filter)).isEqualTo(announcementRepository.findByCategory(filter.getCategory()));
    }

    @Test
    public void testAddToFavorites() throws Exception {
        // TODO testAddToFavorites()
    }
}
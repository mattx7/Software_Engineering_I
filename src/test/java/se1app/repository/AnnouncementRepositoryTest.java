package se1app.repository;

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

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Neak on 08.11.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class AnnouncementRepositoryTest {

    @Autowired
    private AnnouncementRepository announcementRepository;

    @Autowired
    private SportsRepository sportsRepository;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {

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
    public void testFindAnnouncementByCreationDate() throws Exception {
        Date datumuno = new Date(2016, 12, 16, 12, 12);
        List<Announcement> announcement = announcementRepository.findByCreationDate(datumuno);
        assertThat(announcement.get(0).getCreationDate().equals(datumuno));
    }

    @Test
    public void testFindAll() {
        List<Announcement> annos = announcementRepository.findAll();
        assertThat(annos).hasSize(2);
    }

    // TODO @neak testFindAnnouncementByCategory()
}
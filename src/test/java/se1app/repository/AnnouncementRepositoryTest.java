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
import java.util.Optional;

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

    @Before
    public void setup() {

        Date datumuno = new Date(2016, 12, 16, 12, 12);
        User useruno = new User();

        Announcement announo = new Announcement(Sports.JOGGING, "Eine Beschreibung", useruno, datumuno);
        announcementRepository.save(announo);

        Date datumdos = new Date(2016, 12, 16, 12, 12);
        User userdos = new User();

        Announcement annodos = new Announcement(Sports.BIKING, "Zweite Beschreibung", userdos, datumdos);
        announcementRepository.save(annodos);
    }

    @Test
    public void testFindAnnouncementByCreationDate() throws Exception {
        Date datumuno = new Date(2016, 12, 16, 12, 12);
        Optional<Announcement> announcement = announcementRepository.findByCreationDate(datumuno);
        assertThat(announcement.isPresent());
        assertThat(announcement.get().getCreationDate().equals(datumuno));
    }


}
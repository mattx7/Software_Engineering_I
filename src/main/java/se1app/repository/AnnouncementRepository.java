package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.entity.Announcement;

import java.util.Date;
import java.util.Optional;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {

    Optional<Announcement> findByCreationDate(Date date);


}
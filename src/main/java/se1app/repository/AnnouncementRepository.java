package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se1app.entity.Announcement;

import java.util.List;
import java.util.Optional;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {
    // Spring leitet die Query aus der Signatur ab ("id" ist ein Attribut)
    Optional<Announcement> findByID(Integer id);


    // Hier definieren wir eine eigene SQL-Query ("native")
    @Query(value = "SELECT * FROM ANNOUNCEMENT WHERE USER.ID= 2", nativeQuery = true)
    List<Announcement> findAnnouncementFromUser(@Param("id") Integer id);
}
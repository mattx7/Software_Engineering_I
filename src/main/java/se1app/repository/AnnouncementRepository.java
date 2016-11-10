package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.entity.Announcement;
import se1app.entity.Sports;

import java.util.Date;
import java.util.List;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {

    List<Announcement> findByCreationDate(Date date);

//    @Query(value = "SELECT * " +
//            "FROM ANNOUNCEMENT " +
//            "WHERE CATEGORY = :category"
//            ,nativeQuery = true)
//    List<Announcement> findByCategory(@Param("category") Sports category);


    List<Announcement> findByCategory(Sports category);

}
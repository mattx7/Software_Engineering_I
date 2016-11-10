package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.entity.Sports;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface SportsRepository extends JpaRepository<Sports, Integer> {

}

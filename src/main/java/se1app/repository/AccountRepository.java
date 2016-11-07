package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.entity.Account;
import se1app.entity.Announcement;

import java.util.Optional;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    // Spring leitet die Query aus der Signatur ab ("id" ist ein Attribut)
    Optional<Announcement> findByID(Integer id);
}
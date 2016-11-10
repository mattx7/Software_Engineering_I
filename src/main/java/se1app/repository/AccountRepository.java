package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.entity.Account;

import java.util.Optional;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<Account> findByUsername(String username);
}
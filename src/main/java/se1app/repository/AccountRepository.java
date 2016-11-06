package se1app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.entitie.Account;

/**
 * Created by Neak on 06.11.2016.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
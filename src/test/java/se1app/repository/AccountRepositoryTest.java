package se1app.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import se1app.Application;
import se1app.entity.Account;
import se1app.types.Password;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Neak on 08.11.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Before
    public void setup() {
        Account stefan = new Account("Stefan", new Password("stefan123#"));
//        stefan.addReservation(new Reservation("Spectre"));
//        stefan.addReservation(new Reservation("Goldfinger"));
        // Kaskadierendes Speichern der Reservierungen durch entsprechende 'Cascade'-Angabe in Customer!
        accountRepository.save(stefan);

        Account ina = new Account("Ina", new Password("ina12+"));
        // ina.addReservation(new Account("Spectre"));
        accountRepository.save(ina);

    }

    @Test
    public void testFindAll() {
        List<Account> customers = accountRepository.findAll();
        assertThat(customers).hasSize(3);
    }

    @Test
    public void findByID() throws Exception {

    }


}
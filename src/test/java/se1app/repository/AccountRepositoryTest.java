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
import java.util.Optional;

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
        Account stefan = new Account("Stefan", new Password("Stefan1#"));
        accountRepository.save(stefan);

        Account ina = new Account("Ina", new Password("Inaina12#"));
        accountRepository.save(ina);

    }

    @Test
    public void testFindAll() {
        List<Account> accounts = accountRepository.findAll();
        assertThat(accounts).hasSize(2);
    }

    @Test
    public void testFindById() throws Exception {
        Account account = accountRepository.findById(1);
        assertThat(account.getId().equals(1));
    }

    @Test
    public void testFindByUsername() {
        Optional<Account> account = accountRepository.findByUsername("Stefan");
        assertThat(account.isPresent());
        assertThat(account.get().getUsername().equals("Stefan"));
    }

}
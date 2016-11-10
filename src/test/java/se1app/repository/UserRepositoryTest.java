package se1app.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import se1app.Application;
import se1app.entity.User;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Neak on 08.11.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {

        User useruno = new User();
        userRepository.save(useruno);

        User userdos = new User();
        userRepository.save(userdos);
    }


    @Test
    public void testFindAll() {
        List<User> users = userRepository.findAll();
        assertThat(users).hasSize(2);
    }

}
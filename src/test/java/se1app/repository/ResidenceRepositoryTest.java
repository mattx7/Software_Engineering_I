package se1app.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import se1app.Application;
import se1app.entity.Residence;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Neak on 08.11.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class ResidenceRepositoryTest {

    @Autowired
    private ResidenceRepository residenceRepository;

    @Before
    public void setup() {

        Residence resiuno = new Residence("Hamburg");
        residenceRepository.save(resiuno);

        Residence residos = new Residence("Astra");
        residenceRepository.save(residos);
    }

    @Test
    public void testFindByName() throws Exception {
        Optional<Residence> account = residenceRepository.findByName("Hamburg");
        assertThat(account.isPresent());
        assertThat(account.get().getName().equals("Hamburg"));
    }

    @Test
    public void testFindAll() {
        List<Residence> resis = residenceRepository.findAll();
        assertThat(resis).hasSize(2);
    }


}
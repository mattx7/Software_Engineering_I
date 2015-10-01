package demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class CharacterRepositoryTest {

	@Autowired
	private CharacterRepository characterRepository;

	@Before
	public void setup() {
		characterRepository.save(new Character("Stefan"));
		characterRepository.save(new Character("Ina"));
	}

	@Test
	public void testCharacterRepository(){
		List<Character> characters = characterRepository.findAll();
		assertThat(characters).hasSize(2);
	}
}

package demo;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:0")
public class CharacterControllerTest {

    @Autowired
    CharacterRepository repository;

    Character mickey;
    Character minnie;
    Character pluto;

    @Value("${local.server.port}")
    int serverPort;

    @Before
    public void setUp() {

        mickey = new Character("Mickey Mouse");
        minnie = new Character("Minnie Mouse");
        pluto = new Character("Pluto");

        repository.deleteAll();
        repository.save(Arrays.asList(mickey, minnie, pluto));

        port = serverPort;
    }

    @Test
    public void canFetchMickey() {
        Integer mickeyId = mickey.getId();

        when().
                get("/characters/{id}", mickeyId).
                then().
                statusCode(HttpStatus.OK.value()).
                body("name", is("Mickey Mouse")).
                body("id", is(mickeyId));
    }

    @Test
    public void canFetchAll() {
        when().
                get("/characters").
                then().
                statusCode(HttpStatus.OK.value()).
                body("name", hasItems("Mickey Mouse", "Minnie Mouse", "Pluto"));
    }

    @Test
    public void canDeletePluto() {
        Integer plutoId = pluto.getId();

        when()
                .delete("/characters/{id}", plutoId).
                then().
                statusCode(HttpStatus.NO_CONTENT.value());
    }

    @Test
    public void useMockito() {
        // mock creation
        List mockedList = mock(List.class);

        // using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");
        mockedList.clear();

        // selective, explicit, highly readable verification
        verify(mockedList).add("one");
        verify(mockedList).clear();

        // you can mock concrete classes, not only interfaces
        LinkedList mockedLinkedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        when(mockedLinkedList.get(0)).thenReturn("first");

        // the following prints "first"
        System.out.println(mockedLinkedList.get(0));

        // the following prints "null" because get(999) was not stubbed
        System.out.println(mockedLinkedList.get(999));
    }
}
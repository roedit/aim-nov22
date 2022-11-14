package tutorial.rest.resources;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import tutorial.rest.domain.Cat;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatResourceTest {

    private CatResource catResource;

    @BeforeEach
    public void setup() {
        catResource = new CatResource();
    }

    ///////////// The tests /////////////

    @Test
    void itShouldReturnSomeCats() {
        ResponseEntity<List<Cat>> cats = catResource.getCats();
        assertEquals(4, cats.getBody().size());
    }

    @Test
    void itShouldReturnSomeCatsWithSomeNamesPopulated() {
        ResponseEntity<List<Cat>> cats = catResource.getCats();

        assertEquals("Luna", cats.getBody().get(2).getName());
    }

    @Test
    void itShouldReturnSomeCatsWithAllFieldsPopulated() {
        ResponseEntity<List<Cat>> cats = catResource.getCats();

        Cat anExpectedCat = new Cat("Luna", 5, "Persian", "Carrots");
        assertEquals(anExpectedCat, cats.getBody().get(0));
    }

    @Test
    void itShouldReturnAllExpectedCats() {
        ResponseEntity<List<Cat>> cats = catResource.getCats();

        List allExpectedCats = List.of(
                new Cat("Luna", 5, "Persian", "Chicken"),
                new Cat("Milo", 3, "Bengal", "Chicken or Fish"),
                new Cat("Oliver", 7, "Persian", "Fish, Chips"),
                new Cat("Bella", 12, "Siamese","Fish, Dogs"),
                new Cat("Willow", 1, "Savannah","None")
        );
        assertEquals(allExpectedCats, cats.getBody());
    }

    @Test
    void itShouldReturnAllExpectedCats_InAlphabeticalOrder() {
        // TODO
    }
}
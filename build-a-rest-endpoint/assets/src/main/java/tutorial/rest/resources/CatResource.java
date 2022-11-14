package tutorial.rest.resources;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tutorial.rest.domain.Cat;

import java.util.List;


@RestController
@RequiredArgsConstructor
@Slf4j
public class CatResource {

    @GetMapping("/cats")
    public ResponseEntity<List<Cat>> getCats() {
        log.info("get cats called");

        List allCats = List.of(
                new Cat("Luna", 5, "Persian", "Chicken"),
                new Cat("Milo", 3, "Bengal", "Chicken, Fish"),
                new Cat("Oliver", 7, "Persian", "Fish, Chips"),
                new Cat("Bella", 12, "Siamese","Fish, Dogs"),
                new Cat("Willow", 1, "Savannah","None")
        );


        return ResponseEntity
                .ok()
                .body(allCats);
    }
}

package tutorial.rest.resources;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tutorial.rest.exceptions.UnauthorizedException;


@RestController
@RequiredArgsConstructor
@Slf4j
public class UserResource {

    @GetMapping("/user/authenticate")
    public ResponseEntity<String> authenticate(@RequestParam("email") String email,
                                             @RequestParam("password") String password) {
        log.info("Authenticate called for email={}", email);

        if (!"bob".equalsIgnoreCase(email)) {
            throw new UnauthorizedException(email);
        }

        if (!"passw0rd".equals(password)) {
            throw new UnauthorizedException(email);
        }

        return ResponseEntity
                .ok()
                .body("OK");
    }
}

package tutorial.rest.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
@Slf4j
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String message) {
        super(message);
        log.info(message);
    }
}

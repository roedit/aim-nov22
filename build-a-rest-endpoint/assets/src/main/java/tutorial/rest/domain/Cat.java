package tutorial.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat {

    private String name;
    private Integer age;
    private String breed;
    private String likes;

    //TODO-insert

}

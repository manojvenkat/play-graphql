package graphql.types;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employer {
    private String id;
    private String name;
    private String mnEmployersNumber;


}

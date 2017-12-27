package graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.types.Employer;

import java.util.ArrayList;
import java.util.List;

public class Query implements GraphQLQueryResolver {

    public Query() {}

    public List<Employer> employers() {

        List<Employer> employers = new ArrayList<>();

        employers.add(new Employer("1", "SpronQ", "1234"));
        employers.add(new Employer("2", "MN", "5678"));

        return employers;
    }
}

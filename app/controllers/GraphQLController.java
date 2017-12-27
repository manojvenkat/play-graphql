package controllers;

import com.coxautodev.graphql.tools.SchemaParser;
import com.fasterxml.jackson.databind.JsonNode;
import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.resolvers.Query;
import graphql.schema.GraphQLSchema;
import play.libs.Json;
import play.mvc.*;

public class GraphQLController extends Controller {

    public Result index() {
        return ok("OK");
    }

    public Result query() {

        JsonNode json = request().body().asJson();
        String query = json.get("query").asText();
        //String operationName = json.get("operationName").asText();
        GraphQL graphQL = GraphQL.newGraphQL(buildSchema()).build();

        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
                .query(query)
                .build();

        ExecutionResult result = graphQL.execute(executionInput);



        return ok(Json.toJson(result.toSpecification()));
    }


    private static GraphQLSchema buildSchema() {

        return SchemaParser.newParser()
                .file("./izp.graphqls")
                .resolvers(new Query())
                .build()
                .makeExecutableSchema();
    }
}

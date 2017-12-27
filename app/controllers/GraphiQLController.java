package controllers;

import play.mvc.*;

public class GraphiQLController extends Controller {

    public Result index() {
        return ok(views.html.graphiql.render());
    }
}

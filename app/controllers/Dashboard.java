package controllers;

import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

@Security.Authenticated(Secured.class)
public class Dashboard extends Controller {
	
	public static Result dashboard() {
		Usuario usuario = Usuario.find.byId(request().username());
		return ok(views.html.principal.dashboard.render(usuario));
	}
}
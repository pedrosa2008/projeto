package controllers;

import models.Usuario;
import play.data.Form;
import play.mvc.Content;
import play.mvc.Controller;
import play.mvc.Result;

public class Autenticacao extends Controller {
	
	static Form<Usuario> usuarioForm = Form.form(Usuario.class);
	
	public static Result index() {
		if (session("idUsuarioLogado") != null) {
			return redirect(routes.Dashboard.dashboard());
		}
		
		return ok(getViewLogin(usuarioForm));
	}
	
	public static Result login() {
		Usuario usuario = null;
		Form<Usuario> form = usuarioForm.bindFromRequest();
		
		if (form.hasErrors()) {
			return badRequest(getViewLogin(form));
		} else {
			usuario = Usuario.authenticate(form.get().usuario, form.get().senha);
			if (usuario == null) {
				flash("error", "Usuário ou Senha inválidos.");
				return badRequest(getViewLogin(form));
			}
		}
		
		session("idUsuarioLogado", usuario.id.toString());
		return redirect(routes.Dashboard.dashboard());
	}
	
	public static Result logout() {
		session().clear();
		//flash("success", "You've been logged out");
		return redirect(routes.Autenticacao.index());
	}

	private static Content getViewLogin(Form<Usuario> form) {
		return views.html.login.index.render(form);
	}
}
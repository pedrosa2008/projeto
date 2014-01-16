package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import play.data.format.Formats;
import play.db.ebean.Model;

@Entity
@Table(name = "usuario")
public class Usuario extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    public Integer id;
	
	@Formats.NonEmpty
	public String usuario;
	
	@Formats.NonEmpty
	public String senha;
    
    @OneToOne
    public Pessoa pessoa;
	
	@ManyToOne
	public Status status;

	public Usuario() {
	}

	public Usuario(Integer id) {
		super();
		this.id = id;
	}

	public Usuario(Integer id, String usuario, String senha, Integer pessoa, Integer status) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.pessoa = new Pessoa(pessoa);
		this.status = new Status(status);
	}

	public static Model.Finder<String, Usuario> find = new Model.Finder<String, Usuario>(String.class, Usuario.class);

	public static Usuario findByUsuario(String usuario) {
		return find.where().eq("usuario", usuario).findUnique();
	}

	public static Usuario authenticate(String usuario, String senha) {
		return find.where().eq("usuario", usuario).eq("senha", senha).eq("status.id", Status.ATIVO).findUnique();
	}

	public String toString() {
		return "Usuario(" + usuario + ")";
	}
}
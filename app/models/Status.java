package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
@Table(name = "status")
public class Status extends Model {

	private static final long serialVersionUID = 1L;
	
	public static final Integer ATIVO = 1; 
	public static final Integer INATIVO = 2; 
	
	@Id
    public Integer id;

	@Constraints.Required
	@Formats.NonEmpty
	public String descricao;

	public Status() {
	}

	public Status(Integer id) {
		super();
		this.id = id;
	}

	public Status(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public static Model.Finder<String, Status> find = new Model.Finder<String, Status>(String.class, Status.class);

	public String toString() {
		return "Status(" + descricao + ")";
	}
}
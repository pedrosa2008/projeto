package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.db.ebean.Model;

@Entity 
@Table(name="pessoa")
public class Pessoa extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Integer id;
    
	@Formats.NonEmpty
    public String nome;
    
	public Pessoa() {
	}
    
	public Pessoa(Integer id) {
		super();
		this.id = id;
	}
    
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public static Model.Finder<String,Pessoa> find = new Model.Finder<String,Pessoa>(String.class, Pessoa.class);
    
    public String toString() {
        return "Pessoa(" + nome + ")";
    }
}
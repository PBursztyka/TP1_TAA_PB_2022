package business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.OneToMany;


@Entity
public class Etudiant extends Compte implements Serializable {
	
	List<RDV> rendezV;
	

	Etudiant (String login, String pwd)
	{
		super(login, pwd);
	}
	
	public Etudiant () {
		
	}
	
	@OneToMany(mappedBy = "etudiant")
	public List<RDV> getRendezV() {
		return rendezV;
	}

	public void setRendezV(List<RDV> rendezV) {
		this.rendezV = rendezV;
	}




}
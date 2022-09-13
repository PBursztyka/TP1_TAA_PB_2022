package business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Professeur extends Compte implements Serializable {
	
	List<RDV> rendezV;
	

	Professeur (String login, String pwd)
	{
		super(login, pwd);
	}
	
	public Professeur () {
		
	}

	@OneToMany(mappedBy = "professeur")
	public List<RDV> getRendezV() {
		return rendezV;
	}

	public void setRendezV(List<RDV> rendezV) {
		this.rendezV = rendezV;
	}
		
	
}

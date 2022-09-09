package business;
import java.util.Date;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RDV {

	int id;
	String intitule;
	Date daterdv;
	list<Professeur>professeurs;
	list<Etudiant>etudiants;

	
	@Id
	@GeneratedValue
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public Date getDaterdv() {
		return daterdv;
	}
	public void setDaterdv(Date daterdv) {
		this.daterdv = daterdv;
	}
	
	@ManyToOne
	public list<Professeur> getProfesseurs() {
		return professeurs;
	}
	public void setProfesseurs(list<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
	
	@ManyToOne
	public list<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(list<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}




	
	
 

}

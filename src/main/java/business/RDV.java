package business;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RDV implements Serializable{

	private long id;
	private String intitule;
	private Date daterdv;
	private Professeur professeur;
	private Etudiant etudiant;
	
	
		
	public RDV(Date daterdv, Professeur professeur, Etudiant etudiant) {
		super();
		this.daterdv = daterdv;
		this.professeur = professeur;
		this.etudiant = etudiant;
	}
	
	public RDV (){
		
	}
	
	@Id
	@GeneratedValue
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	@ManyToOne
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
 

}

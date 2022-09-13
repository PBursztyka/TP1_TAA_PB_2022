package dao;
import business.Compte;



public class CompteDao extends AbstractJpaDao<String, Compte> {
		
	public CompteDao () {
		super(Compte.class);
	} 

}

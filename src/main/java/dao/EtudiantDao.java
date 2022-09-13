package dao;

import business.Etudiant;

public class EtudiantDao extends AbstractJpaDao<String, Etudiant> {
	
	public EtudiantDao() {
		super(Etudiant.class);
	} 

}
	




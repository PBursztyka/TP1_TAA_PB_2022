package dao;

import business.Professeur;

public class ProfesseurDao extends AbstractJpaDao<Long, Professeur> {
		
	public ProfesseurDao() {
		super(Professeur.class);
	} 

}


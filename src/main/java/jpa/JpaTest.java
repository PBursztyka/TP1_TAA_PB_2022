package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import business.Compte;
import business.Etudiant;
import business.Professeur;
import business.RDV;
import dao.CompteDao;
import dao.EtudiantDao;
import dao.ProfesseurDao;
import dao.RDVDao;

public class JpaTest {
	
	private EntityManager manager;
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		 EntityManagerFactory factory = Persistence
				 .createEntityManagerFactory("mysql");
		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		CompteDao comptedao = new CompteDao();
		Compte c = new Compte();
		c.setLogin("compte1");
	
				
		
		EtudiantDao etudiantdao = new EtudiantDao();
		Etudiant et = new Etudiant();
		et.setLogin("etudiant1");
		
		
		ProfesseurDao professeurdao = new ProfesseurDao();
		Professeur p = new Professeur();
		p.setLogin("professeur1");
		
		
		RDVDao rdvdao = new RDVDao();
		RDV r = new RDV();
			
		
		
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
				factory.close();
	}


}

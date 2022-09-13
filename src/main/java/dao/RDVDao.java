package dao;

import business.RDV;

public class RDVDao extends AbstractJpaDao<Long, RDV> {
		
	public RDVDao() {
		super(RDV.class);
	} 

}


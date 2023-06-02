package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Ipl i=new Ipl();
		i.setId(2);
		i.setName("Rohit");
	    i.setTeam("MUMBAI INDIANS");
	    i.setLocation("MUMBAI");
	    
	    i.setId(3);
		i.setName("Shikar Dhavan");
	    i.setTeam("NIGHT RIDERS");
	    i.setLocation("KOLKATTA");
	    
	    
	    entityTransaction.begin();
	    entityManager.persist(i);
	    entityTransaction.commit();
		
	}

}

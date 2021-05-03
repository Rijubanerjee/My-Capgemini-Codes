package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Department1;

public class AddDept {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = fac.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Department1 d1 = new Department1();
		d1.setDeptName("HR");

		Department1 d2 = new Department1();
		d2.setDeptName("Technical");
		em.persist(d1);
		em.persist(d2);
		tx.commit();
		em.close();
		fac.close();
		System.out.println("table created");
	}

}

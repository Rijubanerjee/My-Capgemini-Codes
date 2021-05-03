package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class UpdateEmp {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager rm = fac.createEntityManager();
		EntityTransaction tx = rm.getTransaction();

		try {
			tx.begin();
			Emp emp = rm.find(Emp.class, 1003);
			emp.setEmpSal(69000.0);
			// rm.merge(emp);
			tx.commit();
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
		}

		fac.close();
		System.out.println("row updated");

	}
}

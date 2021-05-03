package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import org.springframework.dao.annotation.PersistenceExceptionTranslationAdvisor;

import com.cg.entity.Emp;

public class DetachDemo {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");

	public static void main(String[] args) {
		EntityManager em = fac.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Emp emp = getEmployee(1003);
			emp.setEmpSal(67000.0);
			em.merge(emp);
			tx.commit();
			em.close();
			fac.close();
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
		}
	}

	public static Emp getEmployee(int eid) {
		EntityManager em = fac.createEntityManager();
		Emp emp = em.find(Emp.class, 1002);
		return emp;
	}

}

package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class DeleteEmp {
public static void main(String[] args) {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
	EntityManager rm = fac.createEntityManager();
	EntityTransaction tx = rm.getTransaction();
	
		tx.begin();
		Emp emp = rm.find(Emp.class, 1002);
		rm.remove(emp);
		
		tx.commit();

	
	fac.close();
	System.out.println("Row deleted");
}
}

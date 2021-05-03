package com.cg.client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class AddEmployee {
	public static void main(String[] args) {
	Emp emp = new Emp();
	emp.setEmpId(1003);
	emp.setEmpName("popeye");
	emp.setEmpSal(11000.0);
	emp.setEmpDept("sailor");
	emp.setempDoj(LocalDate.of(2016, 06, 21));
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
	EntityManager rm = fac.createEntityManager();
	EntityTransaction tx = rm.getTransaction();
	try {
		tx.begin();
		rm.persist(emp);
		tx.commit();
	}catch (Exception ex) {
		if(tx!=null)
			tx.rollback();
	}
	
	fac.close();
	System.out.println("table created");
	}
}


package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Emp;

public class ViewbyDept {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager rm = fac.createEntityManager();
		Emp emp = rm.find(Emp.class, 1002);
		System.out.println(emp);
		rm.detach(emp);
		Emp emp1 = rm.find(Emp.class, 1002);
		System.out.println(emp1);
		rm.close();
		fac.close();
	}

}

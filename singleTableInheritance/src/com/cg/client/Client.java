package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Computer;
import com.cg.entity.Mobile;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = fac.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Computer obj1 = new Computer();
		obj1.setPid(1);
		obj1.setHdd("4TB");
		obj1.setPname("acer");
		em.persist(obj1);
		
		Mobile obj2 = new Mobile();
		obj2.setPid(2);
		obj2.setCampx("69MPX");
		obj2.setPname("Samsung");
		em.persist(obj2);
		
		em.close();
		fac.close();
		System.out.println("table created");
	}

}

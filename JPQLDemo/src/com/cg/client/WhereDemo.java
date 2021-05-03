package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Emp;



public class WhereDemo {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = fac.createEntityManager();
		//String jpql = "from Emp where empDept = :dname";
		String jpql = "Select e from Emp e where e.empDept=:dname";
		TypedQuery<Emp> qry = em.createQuery(jpql, Emp.class);
		
		//Query qry = em.createQuery(jpql);
		qry.setParameter("dname", "HR");
		
		List<Emp> lst = qry.getResultList();
		em.close();
		fac.close();
		lst.forEach(System.out::println);
		
	}

}

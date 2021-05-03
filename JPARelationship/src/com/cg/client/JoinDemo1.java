package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Emp;

public class JoinDemo1 {
public static void main(String[] args) {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
	EntityManager em = fac.createEntityManager();
	
	String jpql = "FROM Emp e inner join fetch e.dept";
	TypedQuery<Emp> qry = em.createQuery(jpql, Emp.class);
	List<Emp> lst = qry.getResultList();
	em.close();
	fac.close();
	for (Emp emp: lst) {
		System.out.println(emp);
		System.out.println(emp.getDept());
		System.out.println("_________________");
	}
}
}

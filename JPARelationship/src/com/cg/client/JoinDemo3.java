package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Department1;
import com.cg.entity.Emp;

public class JoinDemo3 {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = fac.createEntityManager();

		String jpql = "FROM Department1 d inner join fetch d.Employees where d.deptName = :dname";
		TypedQuery<Emp> qry = em.createQuery(jpql, Emp.class);
		//List<Emp> lst = qry.getResultList();
		Department1 dept = qry.getSingleResult();
		em.close();
		fac.close();
		System.out.println(dept);
		dept.getEmployees().forEach(System.out::println);
		
		

	}
}

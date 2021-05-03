package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.Department1;
import com.cg.entity.Emp;
import com.cg.exceptions.DeptException;

@Repository("mydao")
public class EmpDaoImpl implements IEmpDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Emp> viewEmployee(){
		TypedQuery<Emp> qry = em.createQuery("from Emp e inner join fetch e.dept", Emp.class);
		List<Emp> lst = qry.getResultList();
		return lst;
	}
	@Override
	public Emp addEmployee(Emp emp) {
		em.persist(emp);
		return emp;
	}
	@Override
	public Department1 getDepartment(String deptName) {
		TypedQuery<Department1> qry = em.createQuery("from Department1 where deptName=:dname", Department1.class);
		qry.setParameter("dname", deptName);
		Department1 dept = qry.getSingleResult();
		return dept;
	}
	
	

}

package com.cg.dao;

import java.util.List;

import com.cg.entity.Department1;
import com.cg.entity.Emp;

public interface IEmpDao {
	public List<Emp> viewEmployee();
	public Emp addEmployee(Emp emp);
	public Department1 getDepartment(String deptName);
	public boolean editEmployee(Emp emp);
	public 
}

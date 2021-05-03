package com.cg.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cg_dept")
public class Department1 {
	@Id
	@Column(name = "dept_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	
	@Column(name = "dept_Name")
	private String deptName;
	
	@OneToMany(mappedBy = "dept")
	private Set<Emp> employees;

	public Set<Emp> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Emp> employees) {
		this.employees = employees;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return deptId + " " + deptName;
	}
	

}

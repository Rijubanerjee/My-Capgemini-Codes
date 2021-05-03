package com.cg.bean;

public abstract class Emp {
	private int empid;
	private String ename;
	private double sal;
	public Emp(int empid, String ename, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	public void display () {
		System.out.println(empid+ename+sal);
	}
	public abstract double calSalary();

}

package com.cg.employee;

public class Emp implements Comparable{
	private int empId;
	private String empName;
	private double empSal;
	
	public Emp(int EmpId,String empName,double empSal) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	

	public int getEmpId() {
		return empId;
	}



	public String getEmpName() {
		return empName;
	}



	public double getEmpSal() {
		return empSal;
	}
	
	
	@Override
	public String toString() {
		return empId + " "+empName+" "+empSal;
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

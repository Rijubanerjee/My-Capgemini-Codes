package com.cg.service;

public class Contract extends Emp{
	private int days;

	public Contract(int empid,String ename,double sal,int days) {
		super(empid,ename,sal);
		this.days = days;
	}
	public double calSalary() {
		return this.getSal()*days;
	}
	public void display() {
		super.display();
		String etype = getClass().getSimpleName();
		System.out.printf("%10s%10s%10d%10.2f%10\n","--","--",days,calSalary(),etype);
	}
}
 
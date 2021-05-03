package com.cg.service;

public class Onroll extends Emp{
	private double pf;
	private double da;
	public Onroll(int empid, String ename, double sal) {
		super(empid,ename,sal);
		pf=this.getSal()*0.12;
		da=this.getSal()*0.4;
		// TODO Auto-generated constructor stub
	}
	public double calsalary() {
		return this.getSal() + da -pf;
	}
	
	public void display() {
		super.display();
		String etype = getClass().getSimpleName();
		System.out.printf("10.2f%10.2%10s%10s%10s\n",da,pf,"--",calsalary(),etype);
	}
}

package com.cg.dto;

public class Account {

	private int accId;
	private String custName;
	private double bal;
	
	public Account(int accId, String custName, double bal) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.bal = bal;
	}

	
	public void setBal(double bal) {
		this.bal = bal;
	}


	public int getAccId() {
		return accId;
	}

	public String getCustName() {
		return custName;
	}

	public double getBal() {
		return bal;
	}


	@Override
	public String toString() {
	
		return accId + " " + custName+ " " + bal;
	}
	
	
	
}

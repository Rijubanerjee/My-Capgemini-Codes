package com.cg.bean;

import com.cg.util.Util;

public class Calculator {
	private double amt;
	private int years;
	private float rate;
	public Calculator() {
		super();
		this.amt = 0;
		this.years = 0;
		this.rate = 0;
	}
	
	public double calSimple() {
		return this.amt * this.years * this.rate /Util.H;
	}
	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) throws Exception {
		if (amt <= 0)
			throw new Exception("The amount must be more than 0");
		this.amt = amt;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) throws Exception {
		if (years <= 0)
			throw new Exception("The number of years must be more than 0");
		this.years = years;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) throws Exception {
		if (rate <= 0)
			throw new Exception("The rate must be more than 0");
		this.rate = rate;
	}

	public double calcComp () {
		return amt * Math.pow(Util.o+this.rate/Util.H, this.years) - this.amt;
	}
	

}

package com.cg.bean;
import com.cg.service.*;

public class Account implements Cdm, Admin{
	public double balance = 5000;
	
	public void withdraw() {
		System.out.println("Wthdraw");
	}

	public double getBalance() {
		return balance;
	}
	
	public void clearPdc() {
		System.out.println("clear pdc");
	}
	
	public void deposit() {
		System.out.println("deposit");
	}
	

}

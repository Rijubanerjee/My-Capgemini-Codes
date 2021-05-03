package com.cg.client;

import com.cg.bean.Account;

public class Client {
	public static void main(String[] args) {
		Account obj = new Account();
		System.out.println(obj.balance);
		obj.withdraw();
		obj.getBalance();
		obj.deposit();
		obj.clearPdc();
		
	}
}

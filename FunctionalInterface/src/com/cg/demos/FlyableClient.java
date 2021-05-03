package com.cg.demos;

import com.cg.service.Flyable;

public class FlyableClient {
	public static void main(String[] args) {
		display(()->System.out.println("eagle"));
		display(()->System.out.println("sparrow"));
		display(()->System.out.println("Aeroplane"));
		
		
	}
	
	public static void display(Flyable obj) {
		System.out.println(obj.getClass().getName());
		obj.fly();
		
	}

}

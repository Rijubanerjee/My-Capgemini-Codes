package com.cg.demos;

import com.cg.service.Flyable;

//lambda expression implemented for Functional Interface
public class LambdaDemo1 {
	public static void main(String[] args) {
		display(()->System.out.println("Eagle"));
		display(()->System.out.println("crow"));
		display(()->System.out.println("Flight"));
		
	}
	public  static void display(Flyable flyobj) {
		flyobj.fly();
	}

}

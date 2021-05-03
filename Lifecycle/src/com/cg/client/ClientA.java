package com.cg.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class ClientA {
	
	static AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		System.out.println("MAIN STARTS");
		IService ser = ctx.getBean("myser", IService.class);
		System.out.println(ser.sayHello());
		
		System.out.println("demand for second time");
		
		IService ser2 = ctx.getBean("myser", IService.class);
		System.out.println(ser2.sayHello());
		ctx.registerShutdownHook();
	}

}

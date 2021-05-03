package com.cg.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServiceImpl implements IService, InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{
	private String msg;

	public ServiceImpl() {
		System.out.println("Service IMPL constructor fires");
	}
	//setter for IOC to inject
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Injecting String Dependancy");
	}
	
	@Override
	public String sayHello() {
		return msg;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DESTROY");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AFTER PROPERTIES SET");
		
	}
	
	public void init() {
		System.out.println("custom init");
	}
	
	public void customDestroy() {
		System.out.println("custom destroy");
	}
	
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean Factory aware");
	}
	public void setBeanName(String arg0) {
		System.out.println("bean name"+arg0);
		
	}
}

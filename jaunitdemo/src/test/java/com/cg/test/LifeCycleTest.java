package com.cg.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleTest {

	public LifeCycleTest() {
		System.out.println("lifecycle constructor ");
	}
	@BeforeAll
	public void beforeAll() {
		System.out.println("before all");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("after all");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("setup");
	}
	@AfterEach
	public  void afterEach() {
		System.out.println("teardown");
	}
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	@Test
	public void test3() {
		System.out.println("test 3");
	}
}







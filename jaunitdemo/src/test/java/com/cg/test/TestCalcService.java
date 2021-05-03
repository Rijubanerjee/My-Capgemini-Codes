package com.cg.test;

import org.junit.jupiter.api.Test;

import com.cg.service.CalcService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class TestCalcService {
	@DisplayName("Test for 5, 3 and 2")
	@Test
	@Tag("prod")
	public void testseries1() {
		CalcService obj = new CalcService();
		assertEquals(5.0, obj.CalcSeries(5, 3, 2));
	}
	@DisplayName("Test for 5, 5 and 2")
	@Test
	@Tag("dev")
	public void testseries2() {
		CalcService obj = new CalcService();
		assertEquals(6.0, obj.CalcSeries(5, 5, 2));
	}
	@DisplayName("Test for 5, 3 and 3")
	@Test 
	@Tag("prod")
	public void testseries3 () {
	CalcService obj = new CalcService();
	assertEquals(5.5, obj.CalcSeries(5, 3, 3));
	}
	@DisplayName("Test for all 0")
	@Test 
	@Tag("dev")
	public void testseries4 () {
	CalcService obj = new CalcService();
	assertEquals(0.0, obj.CalcSeries(0, 0, 0));
	}
}

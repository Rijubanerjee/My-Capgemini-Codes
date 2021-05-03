package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.service.CalcService;

public class SumSeriesTest {

	@Test
	@DisplayName("Test Sum Of Series Up to 10")
	public void testSeries1() {
		CalcService ser = new CalcService();
		assertEquals(55, ser.calcSeries(10));
	}
	
	//@Disabled
	@Test
	@DisplayName("Test Sum Of Series Up to 10000")
	public void testSeries2() {
		CalcService ser = new CalcService();
		assertTimeout(Duration.ofNanos(10), ()->ser.calcSeries(10000));
	}
	
	@Test
	@DisplayName("Test Sum Of Series Up to 500000")
	public void testSeries3() {
		CalcService ser = new CalcService();
		assertTimeout(Duration.ofNanos(10), ()->ser.calcSeries(500000));
	}
}

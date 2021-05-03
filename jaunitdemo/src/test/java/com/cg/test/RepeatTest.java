package com.cg.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import com.cg.service.CalcService;

@DisplayName("Repeated Test For Sum OF Series")
public class RepeatTest {

	@RepeatedTest(3)
	public void testSeries1() {
		CalcService ser = new CalcService();
		assertEquals(55, ser.calcSeries(10));

	}

	@RepeatedTest(5)
	public void testSeries2() {
		CalcService ser = new CalcService();
		assertTimeout(Duration.ofNanos(10), () -> ser.calcSeries(500000));
	}
}

package com.cg.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import com.cg.service.CalcService;

public class Param2Test {

	@ParameterizedTest
	@CsvSource({"5,5,10,10", "5,5,3,6.5", "5,2,10,8.5"})
	public void testSum(int a, int b, int c, double expected) {
		CalcService ser = new CalcService();
		assertEquals(expected, ser.CalcSeries(a, b, c));
	}
}

package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cg.service.Pallimdrome;

//import com.cg.service.PalindromeService;

public class ParamTest {

	@ParameterizedTest()
	@ValueSource(strings= {"nitin", "madam"})
	public void testPalindrome1(String str) {
		Pallimdrome ser = new Pallimdrome();
		assertTrue(ser.checkPallimdrome(str));
	}
	
	@ParameterizedTest()
	@ValueSource(strings= {"", "  ", "amar", "a"})
	public void testPalindrome2(String str) {
		Pallimdrome ser = new Pallimdrome();
		assertFalse(ser.checkPallimdrome(str));
	}
}

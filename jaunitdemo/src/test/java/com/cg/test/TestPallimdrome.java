package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.cg.service.Pallimdrome;

public class TestPallimdrome {
	@Test
	@DisplayName ("Check pallimdrome for nitin")
	@Tag("prod")
	public void testPallimdrome1 () {
		Pallimdrome obj = new Pallimdrome();
		assertTrue(obj.checkPallimdrome("nitin"));
	}
	@Test
	@DisplayName ("Check pallimdrome for madam")
	@Tag("dev")
	public void testPallimdrome2 () {
		Pallimdrome obj = new Pallimdrome();
		assertTrue(obj.checkPallimdrome("madam"));
	}
	@Tag("prod")
	@Test
	@DisplayName ("Check pallimdrome for empty string")
	public void testPallimdrome3 () {
		Pallimdrome obj = new Pallimdrome();
		assertFalse(obj.checkPallimdrome(""));
	}
	@Tag("dev")
	@Test
	@DisplayName ("Check pallimdrome for empty spaces")
	public void testPallimdrome4 () {
		Pallimdrome obj = new Pallimdrome();
		assertFalse(obj.checkPallimdrome("   "));
	}
	@Tag("prod")
	@Test
	@DisplayName ("Check pallimdrome for rama")
	public void testPallimdrome5 () {
		Pallimdrome obj = new Pallimdrome();
		assertFalse(obj.checkPallimdrome("rama"));
	}
	@Tag("dev")
	@Test
	@DisplayName ("Check pallimdrome for a")
	public void testPallimdrome6 () {
		Pallimdrome obj = new Pallimdrome();
		assertFalse(obj.checkPallimdrome("a"));
	}
}

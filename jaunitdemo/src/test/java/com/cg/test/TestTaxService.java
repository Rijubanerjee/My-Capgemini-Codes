package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGenerator.Simple;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.cg.service.TaxException;
import com.cg.service.TaxService;

public class TestTaxService {
	@Test
	@Disabled
	public void testtax1 () throws TaxException {
		TaxService obj = new TaxService();
		assertEquals(0.0, obj.calctax(15000));
	}
	@Test
	@Disabled
	public void testtax2 () throws TaxException {
		TaxService obj = new TaxService();
		assertEquals(30000.0, obj.calctax(800000));
	}
	@Tag("prod")
	@Test
	public void testtax3 () throws TaxException {
		TaxService obj = new TaxService();
		assertEquals(80000.0, obj.calctax(1200000));
	}
	@Tag("prod")
	@Test
	public void testtax4 () {
		TaxService obj = new TaxService();
		assertThrows(TaxException.class, ()->obj.calctax(-32000));
	}
	@Tag("dev")
	@Test
	public void testtax5 () {
		TaxService obj = new TaxService();
		assertThrows(TaxException.class, ()->obj.calctax(0));
	}
}

package com.cg.service;

public class TaxService {
	public double calctax (double income) throws TaxException {
		if (income <= 0)
			throw new TaxException("Income must be greater than 0");
		if (income > 1000000)
			return 500000*0.1 + (income - 1000000)*0.15;
		else if (income > 500000)
			return (income - 500000)*0.1;
		
		return 0;
	}
}

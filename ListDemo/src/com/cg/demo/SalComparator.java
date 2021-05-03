package com.cg.demo;

import java.util.Comparator;

import com.cg.beans.Emp;

public class SalComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return Double.valueOf(e1.getSal()).compareTo(e2.getSal());
	}
	

}

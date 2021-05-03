package com.cg.demos;

import java.util.Comparator;

import com.cg.beans.Emp;

public class SalComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		int res = Double.valueOf(e1.getSal()).compareTo(e2.getSal());
		if (res == 0)
			return Integer.valueOf(e1.getEmpId()).compareTo(e2.getEmpId());
		else 
			return res;
	}
	

}

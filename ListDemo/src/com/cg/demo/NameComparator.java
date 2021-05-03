package com.cg.demo;

import java.util.Comparator;

import com.cg.beans.Emp;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		
		return e1.getEmpname().compareTo(e2.getEmpname());
	}
	
}

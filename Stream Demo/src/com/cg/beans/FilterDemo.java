package com.cg.beans;

import java.util.List;

import com.cg.employee.Emp;
import com.cg.employee.cgUtil;

public class FilterDemo {
	public static void main(String[] args) {
		List<Emp> lst = cgUtil.getEmployee();
		System.out.println("Quering the Employee who earns min 35000");
		lst.stream().filter(e -> e.getEmpSal() >= 35000.0).forEach(cgUtil::display);

	}

}

package com.cg.beans;

import java.util.List;

import com.cg.employee.Emp;
import com.cg.employee.cgUtil;

public class EmployeeEarnMaximumSalary {
	public static void main(String[] args) {
		List<Emp> lst = cgUtil.getEmployee();
		double max = lst.stream().mapToDouble(e -> e.getEmpSal()).max().getAsDouble();
		lst.stream().filter(e -> e.getEmpSal() == max).forEach(cgUtil::display);

	}

}

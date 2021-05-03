package com.cg.beans;

import java.util.List;

import com.cg.employee.Emp;
import com.cg.employee.cgUtil;

public class AggregationDemo {
	public static void main(String[] args) {
		List<Emp> lst = cgUtil.getEmployee();
		long no = lst.stream().count();
		System.out.println("Count " + no);
		double sum = lst.stream().mapToDouble(e -> e.getEmpSal()).sum();
		System.out.println("total Salary of all employee = " + sum);
		double avg = lst.stream().mapToDouble(e -> e.getEmpSal()).average().getAsDouble();
		System.out.println("Average Salary is " + avg);
		double max = lst.stream().mapToDouble(e -> e.getEmpSal()).max().getAsDouble();
		System.out.println("Maximum Salary is " + max);
		double min = lst.stream().mapToDouble(e -> e.getEmpSal()).min().getAsDouble();
		System.out.println("Minimum Salary is " + min);

	}

}

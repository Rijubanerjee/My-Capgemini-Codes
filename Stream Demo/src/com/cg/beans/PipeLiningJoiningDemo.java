package com.cg.beans;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.employee.Emp;
import com.cg.employee.cgUtil;

public class PipeLiningJoiningDemo {
	public static void main(String[] args) {
		List<Emp> lst = cgUtil.getEmployee();
		String result1 = lst.stream().filter(e -> e.getEmpSal() >= 35000).map(e -> e.getEmpName())
				.collect(Collectors.joining());
		System.out.println(result1);

		System.out.println("--------------------using delimeter-----------------------");
		String result2 = lst.stream().filter(e -> e.getEmpSal() >= 35000).map(e -> e.getEmpName())
				.collect(Collectors.joining(","));
		System.out.println(result2);

		System.out.println("--------------------using delimeter-----------------------");
		String result3 = lst.stream().filter(e -> e.getEmpSal() >= 35000).map(e -> e.getEmpName())
				.collect(Collectors.joining(",", "[", "]"));
		System.out.println(result3);

		System.out.println("--------------------Without Using Joining-----------------------");
		List<String> lst2 = lst.stream().filter(e -> e.getEmpSal() >= 35000).map(e -> e.getEmpName())
				.collect(Collectors.toList());
		System.out.println(lst2);

	}

}

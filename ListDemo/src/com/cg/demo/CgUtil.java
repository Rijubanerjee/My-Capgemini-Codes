package com.cg.demo;

import java.util.*;

import com.cg.beans.Emp;

public class CgUtil {
	public static List<Emp> getEmployee() {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1001, 20000, "ram"));
		lst.add(new Emp(1002, 60000, "ajay"));
		lst.add(new Emp(1007, 40000, "tom"));
		lst.add(new Emp(1005, 80000, "jerry"));
		lst.add(new Emp(1009, 50000, "shyam"));
		lst.add(new Emp(1003, 90000, "jadu"));
		return lst;

	}
	public static void display (Emp emp) {
		System.out.println("EmpID"+emp.getEmpId());
		System.out.println("EmpName"+emp.getEmpname());
		System.out.println("EmpSalary"+emp.getSal());
		System.out.println("-------------------------------");
	}

}

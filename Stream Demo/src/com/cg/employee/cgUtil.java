package com.cg.employee;

import java.util.ArrayList;
import java.util.List;

public class cgUtil {
	public static List<Emp> getEmployee(){
		List<Emp> lst =new ArrayList<Emp>();
		lst.add(new Emp(1007,"ram",45000));
		lst.add(new Emp(1001,"anand",24000));
		lst.add(new Emp(1003,"vikas shing",37000));
		lst.add(new Emp(1002,"peter",44000));
		lst.add(new Emp(1005,"arshad",33000));
		lst.add(new Emp(1006,"tom",33000));
		return lst;

	}
	public static void display(Emp emp) {
		System.out.println("Empid"+emp.getEmpId());
		System.out.println("empName"+emp.getEmpName());
		System.out.println("empSalary"+emp.getEmpSal());
		System.out.println("----------------------------------");
	}

}

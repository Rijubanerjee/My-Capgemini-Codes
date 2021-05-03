package com.cg.beans;

import java.util.List;
import java.util.Optional;

import com.cg.employee.Emp;
import com.cg.employee.cgUtil;

public class FindFirstDemo {

	public static void main(String[] args) {
		Emp emp = getEmployee(1002);
		if (emp != null)
			System.out.println(emp);
		else
			System.out.println("No Employee Found");

	}

	public static Emp getEmployee(int eid) {
		List<Emp> lst = cgUtil.getEmployee();
		System.out.println("---------------------Filter whose emp Id is 1002 ------------");
		Optional<Emp> opt = lst.stream().filter(e -> e.getEmpId() == 1002).findFirst();
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

}

package com.cg.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.cg.beans.Emp;

public class demo1 {
	public static void main(String[] args) {
		List <Emp> lst = new ArrayList<>();
		lst.add(new Emp(1001, 20000, "ram"));
		lst.add(new Emp(1002, 60000, "ajay"));
		lst.add(new Emp(1007, 40000, "tom"));
		lst.add(new Emp(1005, 80000, "jerry"));
		lst.add(new Emp(1009, 50000, "shyam"));
		lst.add(new Emp(1003, 90000, "jadu"));
		
		lst.sort(null);
		lst.forEach(System.out :: println);
		System.out.println("Sort by Emp name");
		lst.sort(new NameComparator());
		lst.forEach(System.out :: println);
		System.out.println("Sort by salary");
		lst.sort(new SalComparator());
		lst.forEach(System.out :: println);
	}
}

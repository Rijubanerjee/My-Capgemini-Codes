package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.cg.service.Contract;
import com.cg.service.Onroll;

import Exercise.Emp;

public class Empclient {
	public sEmpic void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Onroll(1001,"Wriju",23000));
		lst.add(new Contract(1002,"Wriju",25000,10));
		generateReport(lst);
	}
	public static void generateReport (List<Emp> lst) {
		System.out.println("------------------------------------------");
		System.out.printf("%10s%15s%10s%10s%10s%10s%10s%10s\n","EID","Ename","SAL","DA","PF","DAYS","NSAL","ETYPE");
		System.out.println("------------------------------------------");
		for (Emp emp:lst) {
			emp.display();
		}
	}
}

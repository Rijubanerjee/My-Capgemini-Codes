package com.cg.service;

import com.cg.dao.Idao;
import com.cg.dto.Emp;

public class EmpService {
	private Idao dao;

	public String findgrade (int eid)throws EmpException {
		Emp emp = dao.getemployee(eid);
		if (emp==null)
			throw new EmpException();
		if (emp.getSal() >= 80000)			
			return "A";
		if (emp.getSal() >= 50000)
			return "B";
		if (emp.getSal() >= 35000)
			return "C";
		else 
			return "D";
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

}

package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Student;

public class StudentService {

	private static List<Student> slist = new ArrayList<>();
	static {
		slist.add(new Student(1001, "Wriju Banerjee", 59, "ECE"));
		slist.add(new Student(1002, "Sanchari Saha", 99, "ECE"));
		slist.add(new Student(1003, "Saswata Maity", 90, "ECE"));
		slist.add(new Student(1004, "Tathagata Bhattacharyya", 90, "ECE"));
	}

	public Student findStudent(int sid) {
		for (Student stu : slist) {
			if (stu.getStudentId() == sid)
				return stu;
		}
		return null;
	}

	public List<Student> findStudent(String Branch) {
		List<Student> newList = new ArrayList<>();
		for (Student stu : slist)
			if (stu.getBranch().equalsIgnoreCase(Branch))
				newList.add(stu);
		return newList;
	}

	public List<Student> findStudent(String Branch, int limit) {
		List<Student> newList = new ArrayList<>();
		int count = 1;
		for (Student stu : slist)
			if (stu.getBranch().equalsIgnoreCase(Branch) && count <= limit) {
				newList.add(stu);
				++count;
			}
		return newList;
	}
}

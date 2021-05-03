package com.cg.client;

import java.util.Scanner;

import com.cg.bean.Student;
import com.cg.service.StudentService;

public class Studentclient {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Student Id");
		int sid = sc.nextInt();
		StudentService ser  = new StudentService();
		Student stu = ser.findStudent(sid);
		if (stu != null)
		System.out.println(stu.getStudentId()+" "+stu.getStuName()+" "+stu.getMarks()+" "+stu.getBranch());
		else 
			System.out.println("Student Id not found");
		sc.close();
}

}

package com.cg.bean;

public class Student {
	private int studentId;
	private String stuName;
	private int marks;
	private String branch;
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public Student(int studentId, String stuName, int marks, String branch) {
		super();
		this.studentId = studentId;
		this.stuName = stuName;
		this.marks = marks;
		this.branch = branch;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}

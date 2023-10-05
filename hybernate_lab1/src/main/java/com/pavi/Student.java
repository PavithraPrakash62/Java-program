package com.pavi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // class to table
public class Student {
	@Id // stuid as primary key
private int studentid;
private String studentname;
private int studentage;
private float studentfees;
//1.generate constructor no arg constructor (super class)
public Student() {
	super();
	
}
//2.generate constructor with arguments
public Student(int studentid, String studentname, int studentage, float studentfees) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentage = studentage;
	this.studentfees = studentfees;
}
//3. generate setter and getter methods
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getStudentage() {
	return studentage;
}
public void setStudentage(int studentage) {
	this.studentage = studentage;
}
public float getStudentfees() {
	return studentfees;
}
public void setStudentfees(float studentfees) {
	this.studentfees = studentfees;
}
//4.generate toString method
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
			+ ", studentfees=" + studentfees + "]";
}




}

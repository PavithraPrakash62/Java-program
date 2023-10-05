package com.pavi.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int studentid;
	private String studentname;
	@ManyToMany
	@JoinTable
	(name="stucourse",
	joinColumns = {@JoinColumn(name="studentid")},
	inverseJoinColumns = {@JoinColumn(name="cid")}
	) 
	List<Course> course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}
	
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
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	
	
	

}

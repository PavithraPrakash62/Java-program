package com.edu.pavi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int stuid;
	private String stuname;
	//mant stu many sub
	
@ManyToMany(mappedBy="student")
List<Subject> subject;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuid, String stuname) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + "]";
	}
	

}

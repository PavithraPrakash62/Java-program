package com.MTM;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
@Id
private int empid;
private String empname;
@ManyToMany
@JoinTable
(name="empproject",
joinColumns = {@JoinColumn(name="empid")},
inverseJoinColumns = {@JoinColumn(name="projectid")}
) 
 List <Project> project;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}

public List<Project> getProject() {
	return project;
}
public void setProject(List<Project> project) {
	this.project = project;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + "]";
}

}

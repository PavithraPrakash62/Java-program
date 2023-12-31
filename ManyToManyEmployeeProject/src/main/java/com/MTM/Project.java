package com.MTM;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
@Id
private int projectid;
private String projectname;

@ManyToMany (mappedBy="project") // 4 table to 3 table
List<Employee> employee; 
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int projectid, String projectname) {
	super();
	this.projectid = projectid;
	this.projectname = projectname;
}
public int getProjectid() {
	return projectid;
}
public void setProjectid(int projectid) {
	this.projectid = projectid;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
}

public List<Employee> getEmployee() {
	return employee;
}
public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "Project [projectid=" + projectid + ", projectname=" + projectname + "]";
}
}

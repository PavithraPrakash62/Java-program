package com.pavi;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int employeeid;
	@Column(length=40,nullable = false)
private String employeename;
private int employeeage;
private float employeesalary;



@ManyToOne   //many employees work under one department
@JoinColumn(name="departmentid")
private Department1 department;
public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee1( String employeename, int employeeage, float employeesalary) {
	super();

	this.employeename = employeename;
	this.employeeage = employeeage;
	this.employeesalary = employeesalary;
	//this.employeedob = employeedob;
}

public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public int getEmployeeage() {
	return employeeage;
}
public void setEmployeeage(int employeeage) {
	this.employeeage = employeeage;
}
public float getEmployeesalary() {
	return employeesalary;
}
public void setEmployeesalary(float employeesalary) {
	this.employeesalary = employeesalary;
}


public Department1 getDepartment() {
	return department;
}
public void setDepartment(Department1 department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeage=" + employeeage
			+ ", employeesalary=" + employeesalary + "]";
}

}

package com.pavi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courseTable")

public class employee {
  @Id
	private int employeeId;
	private String employeename;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int employeeId, String employeename) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployrrname() {
		return employeename;
	}
	public void setEmployrrname(String employrrname) {
		this.employeename = employrrname;
	}
	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", employeename=" + employeename + "]";
	}
	

	

}

package com.pavi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentid;
	@Column(length=30,nullable = false)
	private String departmentname;
	@Column(length=30,nullable = false)
	private String departmentlocation;
	
	//@OneToOne(mappedBy = "department")
	//List<Integer> a=new ArrayList<Integer>();
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="departmentid")
	private List<Employee1> employee;
	
	public Department1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department1( String departmentname, String departmentlocation) {
		super();
		this.departmentname = departmentname;
		this.departmentlocation = departmentlocation;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentlocation() {
		return departmentlocation;
	}
	public void setDepartmentlocation(String departmentlocation) {
		this.departmentlocation = departmentlocation;
	}
	
	/* generate setter and getter for employee*/
	
	public List<Employee1> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee1> employee) {
		this.employee = employee;
	}
	
	
	
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", departmentlocation=" + departmentlocation + ", employee=" + employee + "]";
	}
	
	
	
	
}
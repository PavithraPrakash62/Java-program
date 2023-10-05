package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cid;
@Column(name="cname",nullable=false,length=40,unique=true)

private String cname;
public CourseTable() {
	super();
	// TODO Auto-generated constructor stub
}

public CourseTable(String cname) {
	super();
	this.cname = cname;
}


public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "CourseTable [cid=" + cid + ", cname=" + cname + "]";
}


}

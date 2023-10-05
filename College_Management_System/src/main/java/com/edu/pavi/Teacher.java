package com.edu.pavi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
private int teacherid;
private int teachername;


@OneToMany(mappedBy = "teacher")
private List<Subject> subject;


public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public Teacher(int teacherid, int teachername) {
	super();
	this.teacherid = teacherid;
	this.teachername = teachername;
}
public int getTeacherid() {
	return teacherid;
}
public void setTeacherid(int teacherid) {
	this.teacherid = teacherid;
}
public int getTeachername() {
	return teachername;
}
public void setTeachername(int teachername) {
	this.teachername = teachername;
}

public List<Subject> getSubject() {
	return subject;
}
public void setSubject(List<Subject> subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Teacher [teacherid=" + teacherid + ", teachername=" + teachername + "]";
}


}

package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
@Table(name="studentcourse")
public class StudentCourse {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int studentid;
private String studentname;
@OneToOne
@JoinColumn(name="cid")
private CourseTable course;
public StudentCourse() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentCourse( String studentname) {
	super();
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

public CourseTable getCourse() {
	return course;
}
public void setCourse(CourseTable course) {
	this.course = course;
}
@Override
public String toString() {
	return "StudentCourse [studentid=" + studentid + ", studentname=" + studentname + "]";
}


}

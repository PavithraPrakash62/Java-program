package com.edu.pavi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	private int subid;
	private String subname;
	
	// relation with sub-teacher
	
	@ManyToOne
	@JoinColumn(name="teacherid")
	
	private Teacher teacher;

	
	
	// stu-sub relation
	@ManyToMany
	@JoinTable(name="studentsubject",
	joinColumns = {@JoinColumn(name ="subid" )},
	inverseJoinColumns = {@JoinColumn(name = "stuid")})
	
	private List<Student> student;
	
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subid, String subname) {
		super();
		this.subid = subid;
		this.subname = subname;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subname=" + subname + "]";
	}
	

}
/*@ManyToMany(mappedBy ="Student_Subject")
		
	 private Set<Subject> subjects= new HashSet<>();
//relation with student
	  @ManyToMany
	  @JoinTable(name = "Student_Subject",joinColumns = @JoinColumn(name ="subject_id" ),
	  
			     inverseJoinColumns = @JoinColumn(name = "student_id"))
	   
	  Set<Student>Student_Subject = new HashSet<>();
//relation with teacher
	    @ManyToOne(cascade = CascadeType.ALL)
		
		@JoinColumn(name="teacher_id", referencedColumnName = "teacherId")
	    
		private Teacher teacher;
//relation with subject
	 @JsonIgnore
	 @OneToMany(mappedBy = "teacher")
	 private Set<Subject> subject = new HashSet<>();*/

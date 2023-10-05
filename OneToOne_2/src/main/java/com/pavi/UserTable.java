package com.pavi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private int uage;
	@OneToOne
	@JoinColumn(name="cid")
	private Country country;
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserTable(String uname, int uage) {
		super();
		this.uname = uname;
		this.uage = uage;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserTable [uid=" + uid + ", uname=" + uname + ", uage=" + uage + "]";
	}
	

}

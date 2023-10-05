package com.oto;

public class UserTable {
  
	private int uid;
	private String uname;
	private int uage;
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
	@Override
	public String toString() {
		return "UserTable [uid=" + uid + ", uname=" + uname + ", uage=" + uage + "]";
	}
	
	

}

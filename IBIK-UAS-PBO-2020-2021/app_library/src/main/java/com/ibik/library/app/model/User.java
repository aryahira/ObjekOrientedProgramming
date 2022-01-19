package com.ibik.library.app.model;

public class User {

	private Integer ID;
	private long NIK;
	private String Fullname;
	private String PlaceBirth;
	private String Birthdate;
	private String Gender;
	private String Address;
	private String Email;
	private String Password;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer id) {
		ID = id;
	}
	
	public long getNIK() {
		return NIK;
	}
	
	public void setNIK(long NIK) {
		this.NIK = NIK;
	}
	
	public String getFullname() {
		return Fullname;
	}
	
	public void setFullname(String Fullname) {
		this.Fullname = Fullname;
	}
	
	public String getPlaceBirth() {
		return Password;
	}
	
	public void setPlaceBirth(String PlaceBirth) {
		this.PlaceBirth = PlaceBirth;
	}
	
	public String getBirthdate() {
		return Birthdate;
	}
	
	public void setBirthdate(String Birthdate) {
		this.Birthdate = Birthdate;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	@Override
    public String toString() {
		return "Student{" + "ID=" + ID + ", Fullname=" + Fullname + ", PlaceBirth=" + PlaceBirth + ", Birthdate=" + Birthdate + ", Gender=" + Gender + ", Address=" + Address + ", Email=" + Email + ", Password=" + Password + '}';
    }
	
}